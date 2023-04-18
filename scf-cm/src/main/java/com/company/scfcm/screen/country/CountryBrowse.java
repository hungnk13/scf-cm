package com.company.scfcm.screen.country;

import io.jmix.ui.screen.*;
import com.company.scfcm.entity.Country;

@UiController("cm_Country.browse")
@UiDescriptor("country-browse.xml")
@LookupComponent("countriesTable")
public class CountryBrowse extends StandardLookup<Country> {
}