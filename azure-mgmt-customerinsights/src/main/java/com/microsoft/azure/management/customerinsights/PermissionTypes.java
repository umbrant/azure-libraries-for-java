/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.customerinsights;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for PermissionTypes.
 */
public enum PermissionTypes {
    /** Enum value Read. */
    READ("Read"),

    /** Enum value Write. */
    WRITE("Write"),

    /** Enum value Manage. */
    MANAGE("Manage");

    /** The actual serialized value for a PermissionTypes instance. */
    private String value;

    PermissionTypes(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a PermissionTypes instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed PermissionTypes object, or null if unable to parse.
     */
    @JsonCreator
    public static PermissionTypes fromString(String value) {
        PermissionTypes[] items = PermissionTypes.values();
        for (PermissionTypes item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}