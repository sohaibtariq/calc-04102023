/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package dev.insurtech.api.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * Status2Enum to be used.
 */
public enum Status2Enum {
    DRAFT,

    BINDABLE,

    CONVERTABLE,

    CONVERTED,

    EXPIRED;


    private static TreeMap<String, Status2Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        DRAFT.value = "draft";
        BINDABLE.value = "bindable";
        CONVERTABLE.value = "convertable";
        CONVERTED.value = "converted";
        EXPIRED.value = "expired";

        valueMap.put("draft", DRAFT);
        valueMap.put("bindable", BINDABLE);
        valueMap.put("convertable", CONVERTABLE);
        valueMap.put("converted", CONVERTED);
        valueMap.put("expired", EXPIRED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static Status2Enum constructFromString(String toConvert) throws IOException {
        Status2Enum enumValue = fromString(toConvert);
        if (enumValue == null)
        {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    public static Status2Enum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of Status2Enum values to list of string values.
     * @param toConvert The list of Status2Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Status2Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Status2Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 