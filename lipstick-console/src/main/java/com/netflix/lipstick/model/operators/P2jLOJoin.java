/**
 * Copyright 2013 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.netflix.lipstick.model.operators;

import java.util.List;
import java.util.Map;

import javax.persistence.Entity;

/**
 * Lipstick model object for LOJoin operator.
 *
 * @author jmagnusson
 *
 */
@Entity
public class P2jLOJoin extends P2jLogicalRelationalOperator {
    private Join join;

    public Join getJoin() {
        return join;
    }

    public void setJoin(Join join) {
        this.join = join;
    }

    /**
     * Set the join attribute.
     *
     * @param strategy the join strategy used
     * @param type the join type used
     * @param expression a map of alias to list of fields being joined
     */
    public void setJoin(String strategy, String type, Map<String, List<String>> expression) {
        join = new Join(strategy, type, expression);
    }

}
