package com.company.scfcm.screen.country;

import io.jmix.ui.screen.*;
import com.company.scfcm.entity.Country;

@UiController("cm_Country.edit")
@UiDescriptor("country-edit.xml")
@EditedEntityContainer("countryDc")
public class CountryEdit extends StandardEditor<Country> {
}