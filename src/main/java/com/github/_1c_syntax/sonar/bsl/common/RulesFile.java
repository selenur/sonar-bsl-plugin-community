/*
 * This file is a part of SonarQube 1C (BSL) Community Plugin.
 *
 * Copyright © 2018-2019
 * Nikita Gryzlov <nixel2007@gmail.com>
 *
 * SPDX-License-Identifier: LGPL-3.0-or-later
 *
 * SonarQube 1C (BSL) Community Plugin is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * SonarQube 1C (BSL) Community Plugin is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with SonarQube 1C (BSL) Community Plugin.
 */
package com.github._1c_syntax.sonar.bsl.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
public class RulesFile {

    @JsonProperty("Rules")
    private final List<ACCRule> rules;

    public RulesFile(
            @JsonProperty("Rules") List<ACCRule> rules
    ) {
        this.rules = rules;
    }

    @Data
    public static class ACCRule {

        private final String code;
        private final String name;
        private final String description;
        private final String type;
        private final String severity;

        public ACCRule(
                @JsonProperty("Code") String code,
                @JsonProperty("Name") String name,
                @JsonProperty("Description") String description,
                @JsonProperty("Type") String type,
                @JsonProperty("Severity") String severity
        ) {
            this.code = code;
            this.name = name;
            this.description = description;
            this.type = type;
            this.severity = severity;
        }
    }
}