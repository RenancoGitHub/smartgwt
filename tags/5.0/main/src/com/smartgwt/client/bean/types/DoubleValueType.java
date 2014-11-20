/*
 * Smart GWT (GWT for SmartClient)
 * Copyright 2008 and beyond, Isomorphic Software, Inc.
 *
 * Smart GWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * is published by the Free Software Foundation.  Smart GWT is also
 * available under typical commercial license terms - see
 * http://smartclient.com/license
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */

package com.smartgwt.client.bean.types;

import com.smartgwt.client.bean.types.NumberValueType;
import com.smartgwt.client.bean.BeanValueType;
import com.smartgwt.client.bean.BeanValueType.Convertability;

public class DoubleValueType extends NumberValueType<Double> {
    public static void registerValueType () { 
        // We check first to see if it's already registered, to avoid
        // constructing the singleton over and over again. This will
        // be called multiple times as various BeanFactories initialize
        // themselves.
        if (BeanValueType.getBeanValueType(Double.class) == null) {
            BeanValueType.registerBeanValueType(new DoubleValueType());
        }
        
        // Register the primitive type as well, since we can't do that via
        // an interface.
        PDoubleValueType.registerValueType();
    }

    @Override
    protected Class getValueType () {
        return Double.class;
    }

    @Override
    protected boolean isAssignableFrom (Object value) {
        return value == null || value instanceof Double;
    }

    @Override
    public Convertability convertabilityFrom (Object value) {
        if (value instanceof Double) return Convertability.EXACT;
        if (value instanceof String) return Convertability.SUPPORTED;
        if (value instanceof Number) return Convertability.PREFERRED;

        return super.convertabilityFrom(value);
    }

    @Override 
    public Double convertFrom (Object value) {
        if (value instanceof Number) {
            return ((Number) value).doubleValue();
        } else if (value instanceof String) {
            return Double.valueOf((String) value);
        } else {
            return super.convertFrom(value);
        }
    }
}