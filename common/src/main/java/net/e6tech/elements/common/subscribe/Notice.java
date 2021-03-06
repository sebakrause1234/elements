/*
 * Copyright 2015 Futeh Kao
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


package net.e6tech.elements.common.subscribe;

import java.io.Serializable;

/**
 * Created by futeh on 1/19/16.
 */
public class Notice<T extends Serializable> implements Serializable {
    private String topic;
    private T userObject;

    public Notice() {}

    public Notice(String topic, T userObject) {
        this.topic = topic;
        this.userObject = userObject;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public T getUserObject() {
        return userObject;
    }

    public void setUserObject(T content) {
        this.userObject = content;
    }

    public String toString() {
        return "Topic=" + topic + ", Data=" + userObject.toString();
    }
}
