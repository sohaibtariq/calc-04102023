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
 * PolicyState2Enum to be used.
 */
public enum PolicyState2Enum {
    AL,

    AK,

    AZ,

    AR,

    CA,

    CO,

    CT,

    DC,

    DE,

    FL,

    GA,

    HI,

    ID,

    IL,

    IN,

    IA,

    KS,

    KY,

    LA,

    ME,

    MD,

    MA,

    MI,

    MN,

    MS,

    MO,

    MT,

    NE,

    NV,

    NH,

    NJ,

    NM,

    NY,

    NC,

    ND,

    OH,

    OK,

    OR,

    PA,

    RI,

    SC,

    SD,

    TN,

    TX,

    UT,

    VT,

    VA,

    WA,

    WV,

    WI,

    WY;


    private static TreeMap<String, PolicyState2Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        AL.value = "AL";
        AK.value = "AK";
        AZ.value = "AZ";
        AR.value = "AR";
        CA.value = "CA";
        CO.value = "CO";
        CT.value = "CT";
        DC.value = "DC";
        DE.value = "DE";
        FL.value = "FL";
        GA.value = "GA";
        HI.value = "HI";
        ID.value = "ID";
        IL.value = "IL";
        IN.value = "IN";
        IA.value = "IA";
        KS.value = "KS";
        KY.value = "KY";
        LA.value = "LA";
        ME.value = "ME";
        MD.value = "MD";
        MA.value = "MA";
        MI.value = "MI";
        MN.value = "MN";
        MS.value = "MS";
        MO.value = "MO";
        MT.value = "MT";
        NE.value = "NE";
        NV.value = "NV";
        NH.value = "NH";
        NJ.value = "NJ";
        NM.value = "NM";
        NY.value = "NY";
        NC.value = "NC";
        ND.value = "ND";
        OH.value = "OH";
        OK.value = "OK";
        OR.value = "OR";
        PA.value = "PA";
        RI.value = "RI";
        SC.value = "SC";
        SD.value = "SD";
        TN.value = "TN";
        TX.value = "TX";
        UT.value = "UT";
        VT.value = "VT";
        VA.value = "VA";
        WA.value = "WA";
        WV.value = "WV";
        WI.value = "WI";
        WY.value = "WY";

        valueMap.put("AL", AL);
        valueMap.put("AK", AK);
        valueMap.put("AZ", AZ);
        valueMap.put("AR", AR);
        valueMap.put("CA", CA);
        valueMap.put("CO", CO);
        valueMap.put("CT", CT);
        valueMap.put("DC", DC);
        valueMap.put("DE", DE);
        valueMap.put("FL", FL);
        valueMap.put("GA", GA);
        valueMap.put("HI", HI);
        valueMap.put("ID", ID);
        valueMap.put("IL", IL);
        valueMap.put("IN", IN);
        valueMap.put("IA", IA);
        valueMap.put("KS", KS);
        valueMap.put("KY", KY);
        valueMap.put("LA", LA);
        valueMap.put("ME", ME);
        valueMap.put("MD", MD);
        valueMap.put("MA", MA);
        valueMap.put("MI", MI);
        valueMap.put("MN", MN);
        valueMap.put("MS", MS);
        valueMap.put("MO", MO);
        valueMap.put("MT", MT);
        valueMap.put("NE", NE);
        valueMap.put("NV", NV);
        valueMap.put("NH", NH);
        valueMap.put("NJ", NJ);
        valueMap.put("NM", NM);
        valueMap.put("NY", NY);
        valueMap.put("NC", NC);
        valueMap.put("ND", ND);
        valueMap.put("OH", OH);
        valueMap.put("OK", OK);
        valueMap.put("OR", OR);
        valueMap.put("PA", PA);
        valueMap.put("RI", RI);
        valueMap.put("SC", SC);
        valueMap.put("SD", SD);
        valueMap.put("TN", TN);
        valueMap.put("TX", TX);
        valueMap.put("UT", UT);
        valueMap.put("VT", VT);
        valueMap.put("VA", VA);
        valueMap.put("WA", WA);
        valueMap.put("WV", WV);
        valueMap.put("WI", WI);
        valueMap.put("WY", WY);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PolicyState2Enum constructFromString(String toConvert) throws IOException {
        PolicyState2Enum enumValue = fromString(toConvert);
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
    public static PolicyState2Enum fromString(String toConvert) {
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
     * Convert list of PolicyState2Enum values to list of string values.
     * @param toConvert The list of PolicyState2Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PolicyState2Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PolicyState2Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 