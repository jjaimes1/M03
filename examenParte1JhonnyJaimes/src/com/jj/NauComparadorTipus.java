package com.jj;


import java.util.Comparator;

public class NauComparadorTipus  implements Comparator<Naus_Dades>
{

    @Override
    public int compare(Naus_Dades naus_dades, Naus_Dades t1) {
        if (naus_dades.getTipus().equals(t1.getTipus()))
            {
                if (naus_dades.getModel().equals(t1.getModel()))
                {
                    return 1;
                }
                else
                    return 0;
            }
        else
            return 0;


    }


//	@Override
//	public int compareTo(Employee o) {
//		return this.getName().compareTo(o.getName());
//	}
}

