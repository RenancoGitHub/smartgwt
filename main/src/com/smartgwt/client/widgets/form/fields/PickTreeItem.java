/*
 * Smart GWT (GWT for SmartClient)
 * Copyright 2008 and beyond, Isomorphic Software, Inc.
 *
 * Smart GWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.  Smart GWT is also
 * available under typical commercial license terms - see
 * http://smartclient.com/license
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */
 
package com.smartgwt.client.widgets.form.fields;


import com.smartgwt.client.event.*;
import com.smartgwt.client.core.*;
import com.smartgwt.client.types.*;
import com.smartgwt.client.data.*;
import com.smartgwt.client.data.events.*;
import com.smartgwt.client.rpc.*;
import com.smartgwt.client.callbacks.*;
import com.smartgwt.client.widgets.*;
import com.smartgwt.client.widgets.events.*;
import com.smartgwt.client.widgets.form.*;
import com.smartgwt.client.widgets.form.validator.*;
import com.smartgwt.client.widgets.form.fields.*;
import com.smartgwt.client.widgets.tile.*;
import com.smartgwt.client.widgets.tile.events.*;
import com.smartgwt.client.widgets.grid.*;
import com.smartgwt.client.widgets.grid.events.*;
import com.smartgwt.client.widgets.chart.*;
import com.smartgwt.client.widgets.layout.*;
import com.smartgwt.client.widgets.layout.events.*;
import com.smartgwt.client.widgets.menu.*;
import com.smartgwt.client.widgets.tab.*;
import com.smartgwt.client.widgets.toolbar.*;
import com.smartgwt.client.widgets.tree.*;
import com.smartgwt.client.widgets.tree.events.*;
import com.smartgwt.client.widgets.viewer.*;
import com.smartgwt.client.widgets.calendar.*;
import com.smartgwt.client.widgets.calendar.events.*;
import com.smartgwt.client.widgets.cube.*;
import com.smartgwt.client.widgets.drawing.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import com.smartgwt.client.util.*;
import com.smartgwt.client.util.workflow.*;
import com.google.gwt.event.shared.*;
import com.google.gwt.event.shared.HasHandlers;
import com.smartgwt.logicalstructure.core.*;
import com.smartgwt.logicalstructure.widgets.*;
import com.smartgwt.logicalstructure.widgets.drawing.*;
import com.smartgwt.logicalstructure.widgets.plugins.*;
import com.smartgwt.logicalstructure.widgets.form.*;
import com.smartgwt.logicalstructure.widgets.tile.*;
import com.smartgwt.logicalstructure.widgets.grid.*;
import com.smartgwt.logicalstructure.widgets.chart.*;
import com.smartgwt.logicalstructure.widgets.layout.*;
import com.smartgwt.logicalstructure.widgets.menu.*;
import com.smartgwt.logicalstructure.widgets.tab.*;
import com.smartgwt.logicalstructure.widgets.tableview.*;
import com.smartgwt.logicalstructure.widgets.toolbar.*;
import com.smartgwt.logicalstructure.widgets.tree.*;
import com.smartgwt.logicalstructure.widgets.viewer.*;
import com.smartgwt.logicalstructure.widgets.calendar.*;
import com.smartgwt.logicalstructure.widgets.cube.*;

/**
 * FormItem that allows picking a value from a hierarchical data model.
 */
public class PickTreeItem extends CanvasItem {

    public static PickTreeItem getOrCreateRef(JavaScriptObject jsObj) {

        if(jsObj == null) return null;

        RefDataClass obj = RefDataClass.getRef(jsObj);


        if(obj != null) {
            obj.setJsObj(jsObj);
            return (PickTreeItem) obj;
        } else {
            return new PickTreeItem(jsObj);
        }
    }

    public void setJavaScriptObject(JavaScriptObject jsObj) {
        this.jsObj = jsObj;
    }



    /**
     * Changes the defaults for Canvas AutoChildren named <code>autoChildName</code>.
     *
     * @param autoChildName name of an AutoChild to customize the defaults for.
     * @param defaults Canvas defaults to apply. These defaults override any existing properties
     * without destroying or wiping out non-overridden properties.
     * @see com.smartgwt.client.docs.AutoChildUsage
     */
    public static native void changeAutoChildDefaults(String autoChildName, Canvas defaults) /*-{
        $wnd.isc["PickTreeItem"].changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.Canvas::getConfig()());
    }-*/;

    /**
     * Changes the defaults for FormItem AutoChildren named <code>autoChildName</code>.
     *
     * @param autoChildName name of an AutoChild to customize the defaults for.
     * @param defaults FormItem defaults to apply. These defaults override any existing properties
     * without destroying or wiping out non-overridden properties.
     * @see com.smartgwt.client.docs.AutoChildUsage
     */
    public static native void changeAutoChildDefaults(String autoChildName, FormItem defaults) /*-{
        $wnd.isc["PickTreeItem"].changeDefaults(autoChildName + "Defaults", defaults.@com.smartgwt.client.widgets.form.fields.FormItem::getJsObj()());
    }-*/;

    public PickTreeItem(){
        setAttribute("editorType", "PickTreeItem");
    }

    public PickTreeItem(JavaScriptObject jsObj){
        
        setJavaScriptObject(jsObj);
        
    }

    public PickTreeItem(String name) {
        setName(name);
        setAttribute("editorType", "PickTreeItem");
    }

    public PickTreeItem(String name, String title) {
        setName(name);
		setTitle(title);
        setAttribute("editorType", "PickTreeItem");
    }


    // ********************* Properties / Attributes ***********************


    /**
     * If true, clicking or pressing Enter on a menu item that has a submenu will  select that item (with standard behavior of
     * hiding the menus, calling click  handlers, etc) instead of showing the submenu.
     *
     * @param canSelectParentItems canSelectParentItems Default value is null
     * @see com.smartgwt.client.docs.Selection Selection overview and related methods
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#tree_editing" target="examples">Editing Example</a>
     */
    public void setCanSelectParentItems(Boolean canSelectParentItems) {
        setAttribute("canSelectParentItems", canSelectParentItems);
    }

    /**
     * If true, clicking or pressing Enter on a menu item that has a submenu will  select that item (with standard behavior of
     * hiding the menus, calling click  handlers, etc) instead of showing the submenu.
     *
     * @return Boolean
     * @see com.smartgwt.client.docs.Selection Selection overview and related methods
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#tree_editing" target="examples">Editing Example</a>
     */
    public Boolean getCanSelectParentItems()  {
        return getAttributeAsBoolean("canSelectParentItems");
    }



    /**
     * Specifies an alternative field from which display values should be retrieved for this item.<br> If this item is not
     * databound ({@link com.smartgwt.client.widgets.form.fields.PickTreeItem#getDataSource dataSource} is unset), this is
     * implemented by picking up the value of the specified field from the {@link
     * com.smartgwt.client.widgets.form.fields.PickTreeItem#getValueTree valueTree}.<br> Otherwise this item will attempt to
     * map its underlying value to a display value by retrieving a record from the {@link
     * com.smartgwt.client.widgets.form.fields.PickTreeItem#getDataSource dataSource} where the  {@link
     * com.smartgwt.client.widgets.form.fields.PickTreeItem#getValueField valueField} matches this item's value, and displaying
     * the  <code>displayField</code> value from that record.<br>
     *
     * @param displayField . See {@link com.smartgwt.client.docs.String String}. Default value is null
     */
    public void setDisplayField(String displayField) {
        setAttribute("displayField", displayField);
    }

    /**
     * Specifies an alternative field from which display values should be retrieved for this item.<br> If this item is not
     * databound ({@link com.smartgwt.client.widgets.form.fields.PickTreeItem#getDataSource dataSource} is unset), this is
     * implemented by picking up the value of the specified field from the {@link
     * com.smartgwt.client.widgets.form.fields.PickTreeItem#getValueTree valueTree}.<br> Otherwise this item will attempt to
     * map its underlying value to a display value by retrieving a record from the {@link
     * com.smartgwt.client.widgets.form.fields.PickTreeItem#getDataSource dataSource} where the  {@link
     * com.smartgwt.client.widgets.form.fields.PickTreeItem#getValueField valueField} matches this item's value, and displaying
     * the  <code>displayField</code> value from that record.<br>
     *
     * @return . See {@link com.smartgwt.client.docs.String String}
     */
    public String getDisplayField()  {
        return getAttributeAsString("displayField");
    }


    /**
     * Text to display when this form item has a null or undefined value. <P> If the formItem has a databound pickList, and its
     * {@link com.smartgwt.client.widgets.form.fields.FormItem#getDisplayField displayField} or {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getValueField valueField} (if the former isn't set) has an undefined
     * emptyCellValue field, that field will automatically be set using the emptyDisplayValue property.
     *
     * <br><br>If this method is called after the component has been drawn/initialized:
     * Setter for {@link com.smartgwt.client.widgets.form.fields.PickTreeItem#getEmptyDisplayValue emptyDisplayValue}.
     *
     * @param emptyDisplayValue . See {@link com.smartgwt.client.docs.String String}. Default value is null
     */
    public void setEmptyDisplayValue(String emptyDisplayValue) {
        setAttribute("emptyDisplayValue", emptyDisplayValue);
    }

    /**
     * Text to display when this form item has a null or undefined value. <P> If the formItem has a databound pickList, and its
     * {@link com.smartgwt.client.widgets.form.fields.FormItem#getDisplayField displayField} or {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getValueField valueField} (if the former isn't set) has an undefined
     * emptyCellValue field, that field will automatically be set using the emptyDisplayValue property.
     *
     * @return . See {@link com.smartgwt.client.docs.String String}
     */
    public String getEmptyDisplayValue()  {
        return getAttributeAsString("emptyDisplayValue");
    }


    /**
     * This message will be displayed as a single, disabled option in any empty menu/submenu created from this item's data
     * tree.
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param emptyMenuMessage . See {@link com.smartgwt.client.docs.String String}. Default value is "No items to display"
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#tree_category" target="examples">Tree Example</a>
     */
    public void setEmptyMenuMessage(String emptyMenuMessage) {
        setAttribute("emptyMenuMessage", emptyMenuMessage);
    }

    /**
     * This message will be displayed as a single, disabled option in any empty menu/submenu created from this item's data
     * tree.
     *
     * @return . See {@link com.smartgwt.client.docs.String String}
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#tree_category" target="examples">Tree Example</a>
     */
    public String getEmptyMenuMessage()  {
        return getAttributeAsString("emptyMenuMessage");
    }


    /**
     * If this is a databound item, should the load our set of possible options be loaded on demand (as submenus are
     * displayed), or upfront?
     * <p><b>Note : </b> This is an advanced setting</p>
     *
     * @param loadDataOnDemand loadDataOnDemand Default value is null
     */
    public void setLoadDataOnDemand(Boolean loadDataOnDemand) {
        setAttribute("loadDataOnDemand", loadDataOnDemand);
    }

    /**
     * If this is a databound item, should the load our set of possible options be loaded on demand (as submenus are
     * displayed), or upfront?
     *
     * @return Boolean
     */
    public Boolean getLoadDataOnDemand()  {
        return getAttributeAsBoolean("loadDataOnDemand");
    }


    /**
     * If set, this FormItem will map stored values to display values as though a ValueMap were specified, by fetching records
     * from the  specified <code>optionDataSource</code> and extracting the {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getValueField valueField} and  {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getDisplayField displayField} in loaded records, to derive one valueMap
     * entry per record loaded from the optionDataSource. <P> With the default setting of {@link
     * com.smartgwt.client.widgets.form.fields.PickTreeItem#getFetchMissingValues fetchMissingValues}, fetches will be
     * initiated against the optionDataSource any time the FormItem has a non-null value and no corresponding display value is
     * available.  This includes when the form is first initialized, as well as any subsequent calls to {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#setValue FormItem.setValue}, such as may happen when {@link
     * com.smartgwt.client.widgets.form.DynamicForm#editRecord DynamicForm.editRecord} is called.  Retrieved values are
     * automatically cached by the FormItem. <P> Note that if a normal, static {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getValueMap valueMap} is <b>also</b> specified for the field (either
     * directly in the form item or as part of the field definition in the dataSource), it will be preferred to the data
     * derived from the optionDataSource for whatever mappings are present. <P> In a databound form, if {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getDisplayField displayField} is specified for a FormItem and 
     * <code>optionDataSource</code> is unset, <code>optionDataSource</code> will default to the form's current DataSource
     *
     * @param optionDataSource optionDataSource Default value is null
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#form_controls_various" target="examples">List - Combo Box Example</a>
     */
    public void setOptionDataSource(DataSource optionDataSource) {
        setAttribute("optionDataSource", optionDataSource == null ? null : optionDataSource.getOrCreateJsObj());
    }

    /**
     * If set, this FormItem will map stored values to display values as though a ValueMap were specified, by fetching records
     * from the  specified <code>optionDataSource</code> and extracting the {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getValueField valueField} and  {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getDisplayField displayField} in loaded records, to derive one valueMap
     * entry per record loaded from the optionDataSource. <P> With the default setting of {@link
     * com.smartgwt.client.widgets.form.fields.PickTreeItem#getFetchMissingValues fetchMissingValues}, fetches will be
     * initiated against the optionDataSource any time the FormItem has a non-null value and no corresponding display value is
     * available.  This includes when the form is first initialized, as well as any subsequent calls to {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#setValue FormItem.setValue}, such as may happen when {@link
     * com.smartgwt.client.widgets.form.DynamicForm#editRecord DynamicForm.editRecord} is called.  Retrieved values are
     * automatically cached by the FormItem. <P> Note that if a normal, static {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getValueMap valueMap} is <b>also</b> specified for the field (either
     * directly in the form item or as part of the field definition in the dataSource), it will be preferred to the data
     * derived from the optionDataSource for whatever mappings are present. <P> In a databound form, if {@link
     * com.smartgwt.client.widgets.form.fields.FormItem#getDisplayField displayField} is specified for a FormItem and 
     * <code>optionDataSource</code> is unset, <code>optionDataSource</code> will default to the form's current DataSource
     *
     * @return DataSource
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#form_controls_various" target="examples">List - Combo Box Example</a>
     */
    public DataSource getOptionDataSource()  {
        return DataSource.getOrCreateRef(getAttributeAsJavaScriptObject("optionDataSource"));
    }


    /**
     * If {@link com.smartgwt.client.widgets.form.fields.FormItem#getCanEdit canEdit} is set to <code>false</code>, how should
     * this item be displayed to the user? <P> The default value for PickTreeItems is <code>disabled</code> - note that 
     * <code>readOnly</code> and <code>static</code> appearances have no effect for  PickTreeItems.
     *
     * @param readOnlyDisplay readOnlyDisplay Default value is "disabled"
     */
    public void setReadOnlyDisplay(ReadOnlyDisplayAppearance readOnlyDisplay) {
        setAttribute("readOnlyDisplay", readOnlyDisplay == null ? null : readOnlyDisplay.getValue());
    }

    /**
     * If {@link com.smartgwt.client.widgets.form.fields.FormItem#getCanEdit canEdit} is set to <code>false</code>, how should
     * this item be displayed to the user? <P> The default value for PickTreeItems is <code>disabled</code> - note that 
     * <code>readOnly</code> and <code>static</code> appearances have no effect for  PickTreeItems.
     *
     * @return ReadOnlyDisplayAppearance
     */
    public ReadOnlyDisplayAppearance getReadOnlyDisplay()  {
        return EnumUtil.getEnum(ReadOnlyDisplayAppearance.values(), getAttribute("readOnlyDisplay"));
    }


    /**
     * Which field in the tree-data should be returned as this item's value? If unspecified, the path will be used
     *
     * @param valueField . See {@link com.smartgwt.client.docs.String String}. Default value is null
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#tree_category" target="examples">Tree Example</a>
     */
    public void setValueField(String valueField) {
        setAttribute("valueField", valueField);
    }

    /**
     * Which field in the tree-data should be returned as this item's value? If unspecified, the path will be used
     *
     * @return . See {@link com.smartgwt.client.docs.String String}
     * @see <a href="http://www.smartclient.com/smartgwt/showcase/#tree_category" target="examples">Tree Example</a>
     */
    public String getValueField()  {
        return getAttributeAsString("valueField");
    }


    // ********************* Methods ***********************
	/**
     * Only applies to databound items (see {@link com.smartgwt.client.widgets.form.fields.PickTreeItem#getOptionDataSource
     * optionDataSource}).<br> Performs a fetch type operation on this item's DataSource to retrieve/refresh the tree of data
     * displayed as rows in this items menu.
     */
    public native void fetchData() /*-{
        var self = this.@com.smartgwt.client.core.DataClass::getJsObj()();
        self.fetchData();
    }-*/;

    // ********************* Static Methods ***********************
    /**
     * Class level method to set the default properties of this class. If set, then all subsequent instances of this
     * class will automatically have the default properties that were set when this method was called. This is a powerful
     * feature that eliminates the need for users to create a separate hierarchy of subclasses that only alter the default
     * properties of this class. Can also be used for skinning / styling purposes.
     * <P>
     * <b>Note:</b> This method is intended for setting default attributes only and will effect all instances of the
     * underlying class (including those automatically generated in JavaScript).
     * This method should not be used to apply standard EventHandlers or override methods for
     * a class - use a custom subclass instead.
     *
     * @param pickTreeItemProperties properties that should be used as new defaults when instances of this class are created
     */
    public static native void setDefaultProperties(PickTreeItem pickTreeItemProperties) /*-{
    	var properties = $wnd.isc.addProperties({},pickTreeItemProperties.@com.smartgwt.client.core.RefDataClass::getJsObj()());
    	delete properties.ID;
        $wnd.isc.PickTreeItem.addProperties(properties);
    }-*/;

    // ***********************************************************


    /**
     * If specified, the tree of possible options will be derived from the dataSource as a ResultTree, rather than using
     * this.valueTree.  Options can be loaded on demand or up front according to {@link
     * com.smartgwt.client.widgets.form.fields.PickTreeItem#getLoadDataOnDemand loadDataOnDemand}. <p><b>Note : </b>
     * This is an advanced setting</p>
     *
     * @param dataSource dataSource Default value is null
     */
    public void setDataSource(DataSource dataSource) {
    	if(dataSource==null) {
    		throw new IllegalArgumentException("Invalid call to setDataSource() passing null.  If you're having trouble with loading DataSources, please see the following FAQ: http://forums.smartclient.com/showthread.php?t=8159#aDSLoad");
    	}
        setAttribute("dataSource", dataSource.getOrCreateJsObj());
    }

    /**
     * The DataSource that this component should bind to for default fields and for performing {@link com.smartgwt.client.data.DSRequest}. <P> Can be specified as either a DataSource instance or the String ID of a DataSource.
     *
     * @return DataSource
     */
    public DataSource getDataSource() {
        return DataSource.getOrCreateRef(getAttributeAsJavaScriptObject("dataSource"));
    }
    
    /**
     * A {@link com.smartgwt.client.widgets.tree.Tree} of options from which the user can select.
     *
     * @param valueTree valueTree Default value is null
     */
    public void setValueTree(Tree valueTree) {
        setAttribute("valueTree", valueTree);
    }

}


