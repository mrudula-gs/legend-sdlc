// Copyright 2023 Goldman Sachs
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.finos.legend.sdlc.test.junit.junit4.legend.demo;

import org.finos.legend.sdlc.test.junit.pure.v1.AbstractMappingTest;
import org.junit.Test;

public class SingleQuoteInResultM2M extends AbstractMappingTest
{
    @Test
    public void test1() throws Exception
    {
        runTest(1);
    }

    @Override
    protected String getEntityPath()
    {
        return "legend::demo::SingleQuoteInResultM2M";
    }
}
