package com.company.scfcm.screen.relation;

import io.jmix.ui.screen.*;
import com.company.scfcm.entity.Relation;

@UiController("cm_Relation.edit")
@UiDescriptor("relation-edit.xml")
@EditedEntityContainer("relationDc")
public class RelationEdit extends StandardEditor<Relation> {
}