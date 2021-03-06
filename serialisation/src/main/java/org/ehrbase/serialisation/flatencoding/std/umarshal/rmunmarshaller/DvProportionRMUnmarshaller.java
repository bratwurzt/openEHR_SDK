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

package org.ehrbase.serialisation.flatencoding.std.umarshal.rmunmarshaller;

import com.nedap.archie.rm.datavalues.quantity.DvProportion;
import org.ehrbase.serialisation.walker.Context;

import java.util.Map;

public class DvProportionRMUnmarshaller extends AbstractRMUnmarshaller<DvProportion> {

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<DvProportion> getAssociatedClass() {
        return DvProportion.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void handle(String currentTerm, DvProportion rmObject, Map<String, String> currentValues, Context<Map<String, String>> context) {

        setValue(currentTerm, "numerator", currentValues, rmObject::setNumerator, Double.class);
        setValue(currentTerm, "denominator", currentValues, rmObject::setDenominator, Double.class);
        setValue(currentTerm, "type", currentValues, rmObject::setType, Long.class);
        //Contains numerator/denominator
        consumedPath.add(currentTerm);
    }
}
