package com.naocheda.unguided;

import java.util.Comparator;

public class WaktuTrainingComparator implements Comparator<EksperimenModel> {
    @Override
    public int compare(EksperimenModel m1, EksperimenModel m2) {
        return Integer.compare(m1.getWaktuTraining(), m2.getWaktuTraining());
    }
}
