/*
 * Copyright 2018 FIX Protocol Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 */

package io.fixprotocol.conga.session;

/**
 * Message delivery guarantee
 * 
 * @author Don Mendelson
 *
 */
public enum FlowType {
  /**
   * Guarantees at-most-once delivery
   */
  Idempotent,

  /**
   * No application messages should be sent in one direction of a session
   */
  None,

  /**
   * Guarantees exactly-once message delivery
   */
  Recoverable,

  /**
   * Best effort delivery
   */
  Unsequenced
}