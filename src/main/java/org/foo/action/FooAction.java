/*
 * Copyright [2019] [Foo]
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
 *
 */

package org.foo.action;

import org.elasticsearch.action.Action;
import org.elasticsearch.client.ElasticsearchClient;

/**
 * FooAction.
 */
public class FooAction extends Action<FooActionRequest, FooActionResponse, FooRequestBuilder> {

    public static final FooAction INSTANCE = new FooAction();
    public static final String NAME = "cluster:adhoc/foo";

    private FooAction() {
        super(NAME);
    }

    @Override
    public FooRequestBuilder newRequestBuilder(ElasticsearchClient client) {
        return new FooRequestBuilder(client, this);
    }

    @Override
    public FooActionResponse newResponse() {
        return new FooActionResponse();
    }
}
