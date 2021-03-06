package models.sources;

/**
 * An enumeration type of the different possible aggregate functions
 * (implementation incomplete)
 */
public enum AggregateFunction {
    SUM("SUM"), MEAN("MEAN"), MIN("MIN"), MAX("MAX"),
    COUNT("COUNT"), COUNT_DISTINCT("COUNT_DISTINCT");
    private final String displayName;

    AggregateFunction(final String displayName){
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return this.displayName;
    }
}
