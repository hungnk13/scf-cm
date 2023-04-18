package com.company.scfcm.screen.city;

import io.jmix.ui.screen.*;
import com.company.scfcm.entity.City;

@UiController("cm_City.edit")
@UiDescriptor("city-edit.xml")
@EditedEntityContainer("cityDc")
public class CityEdit extends StandardEditor<City> {
}