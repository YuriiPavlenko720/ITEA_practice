package HW_11_06;

import com.google.gson.annotations.SerializedName;

public class OfficialCurrencyRate {
    @SerializedName("txt")
    String currency;
    @SerializedName("cc")
    String label;
    Double rate;

    public OfficialCurrencyRate(String currency, String label, Double rate) {
        this.currency = currency;
        this.label = label;
        this.rate = rate;
    }

    public OfficialCurrencyRate() {
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return currency + " (" + label + ") - " + rate + " грн.";
    }
}
