package org.kramerlab.tofuml.api.impl.managers;

import org.kramerlab.seitan.api.impl.manager.SEITANManager;
import org.kramerlab.seitan.api.impl.objects.User;
import org.kramerlab.tofuml.api.impl.database.accessors.manager.SPARQLManagerAccessor;

public class SPARQLManager extends SEITANManager

{
    /** Associations */
    private SPARQLManagerAccessor accessor;

    /**
     * Operation SPARQLManager
     *
     * @param caller
     *            -
     * @return
     */
    public SPARQLManager(User caller) {
        super(caller);
    }

    /**
     * Operation perform
     *
     * @param query
     *            -
     * @return String
     */
    public String perform(String query) {
        return null;
    }
}
