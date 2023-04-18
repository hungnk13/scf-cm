package com.company.scfcm.screen.district;

import io.jmix.ui.screen.*;
import com.company.scfcm.entity.District;

@UiController("cm_District.edit")
@UiDescriptor("district-edit.xml")
@EditedEntityContainer("districtDc")
public class DistrictEdit extends StandardEditor<District> {
}