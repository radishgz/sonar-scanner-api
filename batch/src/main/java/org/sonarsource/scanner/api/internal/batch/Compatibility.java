/*
 * SonarQube Scanner API - Batch
 * Copyright (C) 2011-2016 SonarSource SA
 * mailto:contact AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonarsource.scanner.api.internal.batch;

import org.sonar.batch.bootstrapper.Batch;

public class Compatibility {
  private Compatibility() {
    // Utility class
  }

  static void setLogOutputFor5dot2(Batch.Builder builder, final LogOutput logOutput) {
    builder.setLogOutput((formattedMessage, level) -> logOutput.log(formattedMessage, LogOutput.Level.valueOf(level.name())));
  }

}
