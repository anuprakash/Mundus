package com.mbrlabs.mundus.ui.components;

import com.kotcrab.vis.ui.widget.VisTextButton;

/**
 * @author Marcus Brummer
 * @version 24-11-2015
 */
public class MundusToolbar extends Toolbar {

    private VisTextButton saveBtn;
    private VisTextButton importBtn;
    private VisTextButton buildBtn;

    public MundusToolbar() {
        super();
        saveBtn = new VisTextButton("SAVE");
        importBtn = new VisTextButton("IMPORT MODEL");
        buildBtn = new VisTextButton("BUILD");
        addItem(saveBtn);
        addItem(importBtn);
        addItem(buildBtn);
    }

    public VisTextButton getSaveBtn() {
        return saveBtn;
    }

    public VisTextButton getImportBtn() {
        return importBtn;
    }

    public VisTextButton getBuildBtn() {
        return buildBtn;
    }

}
