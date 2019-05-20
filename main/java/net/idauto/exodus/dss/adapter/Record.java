/*
 * Copyright (c) 2019 IDENTITY AUTOMATION, LP. All rights reserved.
 */
package net.idauto.exodus.dss.adapter;

import java.util.*;

/**
 * Stub Implementation of the Record object used by adapters. This is primarily used for compiling java based adapters
 * and should not be used at runtime.
 *
 * @author svella
 */
@SuppressWarnings("unused")
public class Record {

    /**
     * Constructor
     *
     * @param caseSensitiveFieldNames true if field names are case sensitive.
     * @param preserveInsertionOrder  true if field iteration order should preserve insertion order ala ES2015 objects.
     */
    public Record(boolean caseSensitiveFieldNames, boolean preserveInsertionOrder) {
        throw new IllegalStateException("This is just a stub");
    }

    /**
     * Constructor
     *
     * @param caseSensitiveFieldNames true if field names are case sensitive.
     */
    public Record(boolean caseSensitiveFieldNames) {
        throw new IllegalStateException("This is just a stub");
    }

    /**
     * Constructor
     */
    public Record() {
        throw new IllegalStateException("This is just a stub");
    }

    /**
     * Creates a Record and populates it's values from a map
     *
     * @param map the map
     * @return the Record
     */

    public static Record fromMap(Map<?, ?> map) {
        return new Record();
    }

    public static Object fromMapValue(Object value) {
        return null;
    }

    /**
     * Adds an empty field if the field does not already exist.
     *
     * @param field the field name
     */
    public void addField(String field) {
    }

    private Object marshalValue(Object value) {
        return value;
    }

    private Object unmarshalValue(Object value) {
        return value;
    }

    /**
     * Sets the value of a field.
     *
     * @param field the field name
     * @param value the value of the field
     */
    public void setFieldValue(String field, Object value) {
    }

    /**
     * Adds a value to a field.
     *
     * @param field      the field name
     * @param value      the value to add to the field
     * @param ignoreCase true if the value should be considered case insensitive
     */
    public void addFieldValue(String field, Object value, boolean ignoreCase) {
    }

    /**
     * Adds a value to a field.
     *
     * @param field the field name
     * @param value the value to add to the field
     */
    public void addFieldValue(String field, Object value) {
    }

    /**
     * Set the values of a field.
     *
     * @param field  the field name
     * @param values an array containing values to assign to the field
     */
    public void setFieldValues(String field, Collection<?> values) {
    }

    /**
     * Add values to a field.
     *
     * @param field      the field name
     * @param values     a collection containing values to add to the field
     * @param ignoreCase true if the value should be considered case insensitive
     */
    public void addFieldValues(String field, Collection<?> values, boolean ignoreCase) {
    }

    /**
     * Add values to a field.
     *
     * @param field  the field name
     * @param values a collection containing values to add to the field
     */
    public void addFieldValues(String field, Collection<?> values) {
    }

    /**
     * Removes all values from a field.
     *
     * @param field the field name
     */
    public void clearFieldValues(String field) {
    }

    /**
     * Tests if a field has a particular value.
     *
     * @param field      the field name
     * @param value      the value to test
     * @param ignoreCase true if the value should be considered case insensitive
     * @return true if the field has the given value
     */
    public boolean hasFieldValue(String field, Object value, boolean ignoreCase) {
        return false;
    }

    /**
     * Tests if a field has a particular value.
     *
     * @param field the field name
     * @param value the value to test
     * @return true if the field has the given value
     */
    public boolean hasFieldValue(String field, Object value) {
        return false;
    }

    /**
     * Tests if a field exists.
     *
     * @param field the field name
     * @return true if the field exists
     */
    public boolean hasField(String field) {
        return false;
    }

    /**
     * Removes a particular value from a field.
     *
     * @param field      the field name
     * @param value      the value to remove
     * @param ignoreCase true if the value should be considered case insensitive
     */
    public void removeFieldValue(String field, Object value, boolean ignoreCase) {
    }

    /**
     * Removes a particular value from a field.
     *
     * @param field the field name
     * @param value the value to remove
     */
    @SuppressWarnings("unused")
    public void removeFieldValue(String field, Object value) {
    }

    /**
     * Removes a set of values from a field.
     *
     * @param field      the field name
     * @param values     array containing the values to remove
     * @param ignoreCase true if the value should be considered case insensitive
     */
    public void removeFieldValues(String field, Collection<?> values, boolean ignoreCase) {
    }

    /**
     * Removes a set of values from a field.
     *
     * @param field  the field name
     * @param values array containing the values to remove
     */
    @SuppressWarnings("unused")
    public void removeFieldValues(String field, Collection<?> values) {
    }

    /**
     * Removes a field.
     *
     * @param field the field name
     */

    public void removeField(String field) {
    }

    /**
     * Gets the first value of a field.
     *
     * @param field the field name
     * @return the first value or UNDEFINED if none exist;
     */
    public Object getFieldValue(String field) {
        return null;
    }

    /**
     * Gets all the values of a field.
     *
     * @param field the field name
     * @return an array containing all the values of a field or UNDEFINED if the field does not exist
     */
    public Object getFieldValues(String field) {
        return null;
    }

    /**
     * Gets the names of all the fields.
     *
     * @return an array containing all the names of all the fields
     */
    public Object getFieldNames() {
        return null;
    }

    /**
     * Renames a field.
     *
     * @param oldField the name of the field to rename
     * @param newField the new field name
     */
    @SuppressWarnings("unused")
    public void renameField(String oldField, String newField) {
    }

    /**
     * Copies a field.
     *
     * @param oldField the name of the field to copy
     * @param newField the name of the field to copy to
     */
    @SuppressWarnings("unused")
    public void copyField(String oldField, String newField) {
    }

    private Object copyFieldValue(String field) {
        return null;
    }

    /**
     * Removes all but the first value of a field.
     *
     * @param field the name of the field
     */
    @SuppressWarnings("unused")
    public void makeFieldSingleValued(String field) {
    }

    /**
     * Creates a copy of the Record.
     *
     * @return the copy
     */
    public Record copy() {
        return null;
    }

    /**
     * Gets a read-only copy of the field/values map.
     *
     * @return the copy of the map
     */
    public Map<String, Object> getMap() {
        return null;
    }

    /**
     * Gets a read-only copy of the field/values map.
     *
     * @return the copy of the map
     */
    public Map<String, Object> getLiveMap() {
        return null;
    }

    public boolean hasCasSensitiveFieldNames() {
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }

    public boolean equalsIgnoreCase(Object obj) {
        return this == obj;
    }

    public boolean equalsIgnoreCase(Object obj, List<String> fields) {
        return this == obj;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
