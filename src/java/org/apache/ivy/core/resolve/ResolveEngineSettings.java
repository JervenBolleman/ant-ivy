/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.apache.ivy.core.resolve;

import org.apache.ivy.core.module.id.ModuleId;
import org.apache.ivy.plugins.conflict.ConflictManager;
import org.apache.ivy.plugins.report.ReportOutputter;
import org.apache.ivy.plugins.resolver.DependencyResolver;
import org.apache.ivy.plugins.resolver.ResolverSettings;

public interface ResolveEngineSettings extends ResolverSettings {

    void setDictatorResolver(DependencyResolver dictatorResolver);

    boolean debugConflictResolution();

    ReportOutputter[] getReportOutputters();

    DependencyResolver getResolver(ModuleId moduleId);

    String getResolverName(ModuleId mid);

    boolean logNotConvertedExclusionRule();

    ConflictManager getConflictManager(ModuleId mid);

    boolean logModuleWhenFound();

    boolean logResolvedRevision();

}