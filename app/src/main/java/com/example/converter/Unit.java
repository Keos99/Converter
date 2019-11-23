package com.example.converter;

import androidx.annotation.StringRes;

public enum Unit {

    SQ_SENTIMETERS(R.string.sq_sentimeters, 1,1),
    SQ_KILOMETRES(R.string.sq_kilkometres, 1, 1),
    SQ_METRES(R.string.sq_metres, 1, 1),
    HECTARE(R.string.hectare, 1, 1),

    KILOMETRE(R.string.kilometre, 1,1),
    MILE(R.string.mile, 1, 1),
    METRE(R.string.metre, 1, 1),
    CENTIMETRE(R.string.centimetre, 1, 1),
    MILLIMETRE(R.string.millimetre, 1, 1),
    MICROMETRE(R.string.micrometre, 1, 1);

    @StringRes
    public int mlableRecourse;
    public double mConversionToBase;
    public double mConversionFromBase;

    Unit(@StringRes int mlableRecourse, double mConversionToBase, double mConversionFromBase){
        this.mlableRecourse = mlableRecourse;
        this.mConversionToBase = mConversionToBase;
        this.mConversionFromBase = mConversionFromBase;
    }

}
