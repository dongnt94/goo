package com.goo.common.dto;

/**
 * Created by DongPT1 on 6/16/2017.
 */
public class KeyValueDTO implements Comparable<KeyValueDTO> {
    private Object key;
    private String value;

    /**
     * Get value of a key value object
     *
     * @param keyValueDTO
     * @return Return empty String if null
     */
    public static String getValue(KeyValueDTO keyValueDTO) {
        String value = "";
        if (keyValueDTO != null && keyValueDTO.getValue() != null) {
            value = keyValueDTO.getValue();
        }
        return value;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KeyValueDTO that = (KeyValueDTO) o;

        if (key != null ? !key.equals(that.key) : that.key != null) return false;
        return value != null ? value.equals(that.value) : that.value == null;
    }

    @Override
    public int hashCode() {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(KeyValueDTO o) {
        return value.compareTo(o.getValue());
    }
}
