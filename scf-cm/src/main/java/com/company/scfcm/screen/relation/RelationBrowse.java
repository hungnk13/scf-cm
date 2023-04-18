package com.company.scfcm.screen.relation;

import io.jmix.ui.screen.*;
import com.company.scfcm.entity.Relation;

@UiController("cm_Relation.browse")
@UiDescriptor("relation-browse.xml")
@LookupComponent("relationsTable")
public class RelationBrowse extends StandardLookup<Relation> {
}