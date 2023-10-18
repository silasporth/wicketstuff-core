package org.wicketstuff.egrid.toolbar;

import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;
import org.wicketstuff.egrid.component.EditableDataTable;

import java.io.Serial;

/**
 * @author Nadeem Mohammad
 */
public class AbstractEditableToolbar extends Panel {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * Counter used for generating unique component ids.
     */
    private static long counter = 0;

    private final EditableDataTable<?, ?> table;

    /**
     * Constructor
     *
     * @param model model
     * @param table data table this toolbar will be attached to
     */
    public AbstractEditableToolbar(final IModel<?> model, final EditableDataTable<?, ?> table) {
        super(String.valueOf(counter++).intern(), model);
        this.table = table;
    }

    /**
     * Constructor
     *
     * @param table data table this toolbar will be attached to
     */
    public AbstractEditableToolbar(final EditableDataTable<?, ?> table) {
        this(null, table);
    }

    /**
     * @return DataTable this toolbar is attached to
     */
    protected EditableDataTable<?, ?> getTable() {
        return table;
    }
}
