package com.company.scfcm.screen.district;

import io.jmix.ui.screen.*;
import com.company.scfcm.entity.District;

@UiController("cm_District.browse")
@UiDescriptor("district-browse.xml")
@LookupComponent("districtsTable")
public class DistrictBrowse extends StandardLookup<District> {
}