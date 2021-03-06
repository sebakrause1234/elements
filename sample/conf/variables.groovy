/*
 * Copyright 2016 Futeh Kao
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

dataSourceMaxPoolSize = 20
entityManagerTxTimeout = 1200000L
entityManagerLongTransaction = 2000L
entityManagerMonitorTransaction = true
hibernateShowSQL = false
hibernateGenerateStatistics = false
hibernateCacheUseSecondLevelCache = false
clusterName = 'h3_cluster'
clusterHost = '127.0.0.1'
clusterPort = 2552
clusterSeeds = "[\"akka.tcp://${clusterName}@${clusterHost}:${clusterPort}\"]"

// setting System properties
systemProperties {
    'jmx.mxbean.multiname'          'true'
    'hibernate.show_sql'            "${hibernateShowSQL}"
    'hibernate.generate_statistics' "${hibernateGenerateStatistics}"
    'hibernate.cache.use_second_level_cache' "${hibernateCacheUseSecondLevelCache}"
}