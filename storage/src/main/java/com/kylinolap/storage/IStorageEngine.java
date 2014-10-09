/*
 * Copyright 2013-2014 eBay Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kylinolap.storage;

import com.kylinolap.metadata.model.cube.FunctionDesc;
import com.kylinolap.metadata.model.cube.TblColRef;
import com.kylinolap.storage.filter.TupleFilter;
import com.kylinolap.storage.tuple.TupleIterator;

import java.util.Collection;

/**
 * @author xjiang
 */
public interface IStorageEngine {

    TupleIterator search(Collection<TblColRef> dimensions, TupleFilter filter, Collection<TblColRef> groups,
                         Collection<FunctionDesc> metrics, StorageContext context);

}