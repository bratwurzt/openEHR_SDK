/*
 *
 *  *  Copyright (c) 2020  Stefan Spiska (Vitasystems GmbH) and Hannover Medical School
 *  *  This file is part of Project EHRbase
 *  *
 *  *  Licensed under the Apache License, Version 2.0 (the "License");
 *  *  you may not use this file except in compliance with the License.
 *  *  You may obtain a copy of the License at
 *  *
 *  *  http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *  Unless required by applicable law or agreed to in writing, software
 *  *  distributed under the License is distributed on an "AS IS" BASIS,
 *  *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  See the License for the specific language governing permissions and
 *  *  limitations under the License.
 *
 */

package org.ehrbase.serialisation.walker;

import com.nedap.archie.rm.RMObject;
import com.nedap.archie.rminfo.ArchieRMInfoLookup;
import org.ehrbase.webtemplate.model.WebTemplateNode;

import java.util.List;

public abstract class FromCompositionWalker<T> extends Walker<T> {
    public static final ArchieRMInfoLookup ARCHIE_RM_INFO_LOOKUP = ArchieRMInfoLookup.getInstance();

    protected Object extractRMChild(RMObject currentRM, WebTemplateNode currentNode, WebTemplateNode childNode, boolean isChoice, Integer count) {

        ItemExtractor itemExtractor = new ItemExtractor(currentRM, currentNode, childNode, isChoice && count == null).invoke();

        Object child = itemExtractor.getChild();

        if (count != null && child instanceof List) {

            child = ((List<RMObject>) child).get(count);
            if (isChoice && !ARCHIE_RM_INFO_LOOKUP.getTypeInfo(childNode.getRmType()).getJavaClass().isAssignableFrom(child.getClass())) {
                child = null;
            }
        }

        return child;
    }

    @Override
    protected int calculateSize(Context<T> context, WebTemplateNode childNode) {
        Object child = extractRMChild(context.getRmObjectDeque().peek(), context.getNodeDeque().peek(), childNode, false, null);
        if (child instanceof List) {
            return ((List) child).size() - 1;
        } else {
            return 0;
        }
    }
}
