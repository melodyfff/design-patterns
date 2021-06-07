/**
 *
 *
 *
 * - Choreography-Based Saga. <p/>
 * In this approach, there is no central orchestrator.
 * Each service participating in the Saga performs their transaction and publish events.
 * The other services act upon those events and perform their transactions.
 * Also, they may or not publish other events based on the situation.
 *
 * <p/>
 *
 * - Orchestration-Based Saga<p/>
 * In this approach, there is a Saga orchestrator that manages all the transactions and directs
 * the participant services to execute local transactions based on events.
 * This orchestrator can also be though of as a Saga Manager.
 *
 *
 * see [How Choreography-Based-saga works in microservices] https://www.kindsonthegenius.com/microservices/how-choreography-based-saga-works-in-microservices/
 * see [Orchestration-based Saga using Cadence Workflow] https://sultanov.dev/blog/orchestration-based-saga-using-cadence/
 * see https://github.com/iluwatar/java-design-patterns/tree/master/saga
 */
package com.xinchen.pattern.saga;