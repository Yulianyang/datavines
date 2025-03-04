/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.datavines.notification.plugin.lark.entity;

import lombok.Data;
import lombok.ToString;

import java.util.Objects;

@Data
@ToString
public class ReceiverConfig {

    /**
     * Feishu Group Name
     */
    private String groupName;

    /**
     * Feishu webhook
     */
    private String webhook;

    /**
     * Is it @ everyone
     */
    private Boolean atAll;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReceiverConfig that = (ReceiverConfig) o;
        return Objects.equals(webhook, that.webhook) && atAll == that.atAll;
    }

    @Override
    public int hashCode() {
        return Objects.hash(webhook, atAll);
    }
}
