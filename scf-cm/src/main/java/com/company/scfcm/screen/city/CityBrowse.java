package com.company.scfcm.screen.city;

import io.jmix.ui.screen.*;
import com.company.scfcm.entity.City;

@UiController("cm_City.browse")
@UiDescriptor("city-browse.xml")
@LookupComponent("citiesTable")
public class CityBrowse extends StandardLookup<City> {
}