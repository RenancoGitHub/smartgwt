/*
 * SmartGWT (GWT for SmartClient)
 * Copyright 2008 and beyond, Isomorphic Software, Inc.
 *
 * SmartGWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.  SmartGWT is also
 * available under typical commercial license terms - see
 * http://smartclient.com/license
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */
 
package com.smartgwt.client.widgets;



import com.smartgwt.client.event.*;
import com.smartgwt.client.core.*;
import com.smartgwt.client.types.*;
import com.smartgwt.client.data.*;
import com.smartgwt.client.data.events.*;
import com.smartgwt.client.rpc.*;
import com.smartgwt.client.widgets.*;
import com.smartgwt.client.widgets.events.*;
import com.smartgwt.client.widgets.form.*;
import com.smartgwt.client.widgets.form.validator.*;
import com.smartgwt.client.widgets.form.fields.*;
import com.smartgwt.client.widgets.tile.*;
import com.smartgwt.client.widgets.tile.events.*;
import com.smartgwt.client.widgets.grid.*;
import com.smartgwt.client.widgets.grid.events.*;
import com.smartgwt.client.widgets.layout.*;
import com.smartgwt.client.widgets.menu.*;
import com.smartgwt.client.widgets.tab.*;
import com.smartgwt.client.widgets.toolbar.*;
import com.smartgwt.client.widgets.tree.*;
import com.smartgwt.client.widgets.tree.events.*;
import com.smartgwt.client.widgets.viewer.*;
import com.smartgwt.client.widgets.calendar.*;
import com.smartgwt.client.widgets.calendar.events.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import com.smartgwt.client.util.JSOHelper;
import com.smartgwt.client.util.EnumUtil;
import com.google.gwt.event.shared.*;
import com.google.gwt.event.shared.HasHandlers;
   /**
    * Simple interactive calendar interface used to pick a date.&#010 Used by the {@link com.smartgwt.client.widgets.form.fields.DateItem} class.

    */

public class DateChooser extends Canvas  implements com.smartgwt.client.widgets.events.HasDataChangedHandlers {

    public static DateChooser getOrCreateRef(JavaScriptObject jsObj) {
        if(jsObj == null) return null;
        BaseWidget obj = BaseWidget.getRef(jsObj);
        if(obj != null) {
            return (DateChooser) obj;
        } else {
            return new DateChooser(jsObj);
        }
    }


    public DateChooser(){
        
    }

    public DateChooser(JavaScriptObject jsObj){
        super(jsObj);
    }

    protected native JavaScriptObject create()/*-{
        var config = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
        var widget = $wnd.isc.DateChooser.create(config);
        this.@com.smartgwt.client.widgets.BaseWidget::doInit()();
        return widget;
    }-*/;
    // ********************* Properties / Attributes ***********************

    /**
    * Height of the header area (containing the next/previous month & year buttons) in pixels
    *
    * @param headerHeight headerHeight Default value is 20
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setHeaderHeight(int headerHeight)  throws IllegalStateException {
        setAttribute("headerHeight", headerHeight, false);
    }
    /**
     * Height of the header area (containing the next/previous month & year buttons) in pixels
     *
     *
     * @return int
     *
     */
    public int getHeaderHeight()  {
        return getAttributeAsInt("headerHeight");
    }

    /**
    * Overridden directory where images for this widget (such as the month and year button icons)&#010 may be found.
    * <p><b>Note : </b> This is an advanced setting</p>
    *
    * @param skinImgDir skinImgDir Default value is "images/common/"
    */
    public void setSkinImgDir(String skinImgDir) {
        setAttribute("skinImgDir", skinImgDir, true);
    }
    /**
     * Overridden directory where images for this widget (such as the month and year button icons)&#010 may be found.
     *
     *
     * @return String
     *
     */
    public String getSkinImgDir()  {
        return getAttributeAsString("skinImgDir");
    }

    /**
    * Icon for the previous year button
    *
    * @param prevYearIcon prevYearIcon Default value is "[SKIN]doubleArrow_left.gif"
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setPrevYearIcon(String prevYearIcon)  throws IllegalStateException {
        setAttribute("prevYearIcon", prevYearIcon, false);
    }
    /**
     * Icon for the previous year button
     *
     *
     * @return String
     *
     */
    public String getPrevYearIcon()  {
        return getAttributeAsString("prevYearIcon");
    }

    /**
    * Width of the icon for the previous year button
    *
    * @param prevYearIconWidth prevYearIconWidth Default value is 14
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setPrevYearIconWidth(int prevYearIconWidth)  throws IllegalStateException {
        setAttribute("prevYearIconWidth", prevYearIconWidth, false);
    }
    /**
     * Width of the icon for the previous year button
     *
     *
     * @return int
     *
     */
    public int getPrevYearIconWidth()  {
        return getAttributeAsInt("prevYearIconWidth");
    }

    /**
    * Height of the icon for the previous year button
    *
    * @param prevYearIconHeight prevYearIconHeight Default value is 7
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setPrevYearIconHeight(int prevYearIconHeight)  throws IllegalStateException {
        setAttribute("prevYearIconHeight", prevYearIconHeight, false);
    }
    /**
     * Height of the icon for the previous year button
     *
     *
     * @return int
     *
     */
    public int getPrevYearIconHeight()  {
        return getAttributeAsInt("prevYearIconHeight");
    }

    /**
    * Icon for the previous month button
    *
    * @param prevMonthIcon prevMonthIcon Default value is "[SKIN]arrow_left.gif"
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setPrevMonthIcon(String prevMonthIcon)  throws IllegalStateException {
        setAttribute("prevMonthIcon", prevMonthIcon, false);
    }
    /**
     * Icon for the previous month button
     *
     *
     * @return String
     *
     */
    public String getPrevMonthIcon()  {
        return getAttributeAsString("prevMonthIcon");
    }

    /**
    * Width of the icon for the previous month button
    *
    * @param prevMonthIconWidth prevMonthIconWidth Default value is 7
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setPrevMonthIconWidth(int prevMonthIconWidth)  throws IllegalStateException {
        setAttribute("prevMonthIconWidth", prevMonthIconWidth, false);
    }
    /**
     * Width of the icon for the previous month button
     *
     *
     * @return int
     *
     */
    public int getPrevMonthIconWidth()  {
        return getAttributeAsInt("prevMonthIconWidth");
    }

    /**
    * Height of the icon for the previous month button
    *
    * @param prevMonthIconHeight prevMonthIconHeight Default value is 7
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setPrevMonthIconHeight(int prevMonthIconHeight)  throws IllegalStateException {
        setAttribute("prevMonthIconHeight", prevMonthIconHeight, false);
    }
    /**
     * Height of the icon for the previous month button
     *
     *
     * @return int
     *
     */
    public int getPrevMonthIconHeight()  {
        return getAttributeAsInt("prevMonthIconHeight");
    }

    /**
    * Icon for the next year button
    *
    * @param nextYearIcon nextYearIcon Default value is "[SKIN]doubleArrow_right.gif"
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setNextYearIcon(String nextYearIcon)  throws IllegalStateException {
        setAttribute("nextYearIcon", nextYearIcon, false);
    }
    /**
     * Icon for the next year button
     *
     *
     * @return String
     *
     */
    public String getNextYearIcon()  {
        return getAttributeAsString("nextYearIcon");
    }

    /**
    * Width of the icon for the next year button
    *
    * @param nextYearIconWidth nextYearIconWidth Default value is 14
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setNextYearIconWidth(int nextYearIconWidth)  throws IllegalStateException {
        setAttribute("nextYearIconWidth", nextYearIconWidth, false);
    }
    /**
     * Width of the icon for the next year button
     *
     *
     * @return int
     *
     */
    public int getNextYearIconWidth()  {
        return getAttributeAsInt("nextYearIconWidth");
    }

    /**
    * Height of the icon for the next year button
    *
    * @param nextYearIconHeight nextYearIconHeight Default value is 7
    */
    public void setNextYearIconHeight(int nextYearIconHeight) {
        setAttribute("nextYearIconHeight", nextYearIconHeight, true);
    }
    /**
     * Height of the icon for the next year button
     *
     *
     * @return int
     *
     */
    public int getNextYearIconHeight()  {
        return getAttributeAsInt("nextYearIconHeight");
    }

    /**
    * Icon for the next month button
    *
    * @param nextMonthIcon nextMonthIcon Default value is "[SKIN]arrow_right.gif"
    */
    public void setNextMonthIcon(String nextMonthIcon) {
        setAttribute("nextMonthIcon", nextMonthIcon, true);
    }
    /**
     * Icon for the next month button
     *
     *
     * @return String
     *
     */
    public String getNextMonthIcon()  {
        return getAttributeAsString("nextMonthIcon");
    }

    /**
    * Width of the icon for the next month button
    *
    * @param nextMonthIconWidth nextMonthIconWidth Default value is 7
    */
    public void setNextMonthIconWidth(int nextMonthIconWidth) {
        setAttribute("nextMonthIconWidth", nextMonthIconWidth, true);
    }
    /**
     * Width of the icon for the next month button
     *
     *
     * @return int
     *
     */
    public int getNextMonthIconWidth()  {
        return getAttributeAsInt("nextMonthIconWidth");
    }

    /**
    * Height of the icon for the next month button
    *
    * @param nextMonthIconHeight nextMonthIconHeight Default value is 7
    */
    public void setNextMonthIconHeight(int nextMonthIconHeight) {
        setAttribute("nextMonthIconHeight", nextMonthIconHeight, true);
    }
    /**
     * Height of the icon for the next month button
     *
     *
     * @return int
     *
     */
    public int getNextMonthIconHeight()  {
        return getAttributeAsInt("nextMonthIconHeight");
    }

    /**
    * If this property is set to true the previous and next year buttons will render out the &#010 previous and next month button icons twice rather than using the&#010 {@link com.smartgwt.client.widgets.DateChooser#getPrevYearIcon prevYearIcon} and {@link com.smartgwt.client.widgets.DateChooser#getNextYearIcon nextYearIcon}.&#010 <P>&#010 Set to <code>true</code> by default as not all skins contain media for the year icons.
    *
    * @param showDoubleYearIcon showDoubleYearIcon Default value is true
    */
    public void setShowDoubleYearIcon(Boolean showDoubleYearIcon) {
        setAttribute("showDoubleYearIcon", showDoubleYearIcon, true);
    }
    /**
     * If this property is set to true the previous and next year buttons will render out the &#010 previous and next month button icons twice rather than using the&#010 {@link com.smartgwt.client.widgets.DateChooser#getPrevYearIcon prevYearIcon} and {@link com.smartgwt.client.widgets.DateChooser#getNextYearIcon nextYearIcon}.&#010 <P>&#010 Set to <code>true</code> by default as not all skins contain media for the year icons.
     *
     *
     * @return Boolean
     *
     */
    public Boolean getShowDoubleYearIcon()  {
        return getAttributeAsBoolean("showDoubleYearIcon");
    }

    /**
    * Style for the pop-up year menu.
    *
    * @param yearMenuStyle yearMenuStyle Default value is "dateChooserYearMenu"
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setYearMenuStyle(String yearMenuStyle)  throws IllegalStateException {
        setAttribute("yearMenuStyle", yearMenuStyle, false);
    }
    /**
     * Style for the pop-up year menu.
     *
     *
     * @return String
     *
     */
    public String getYearMenuStyle()  {
        return getAttributeAsString("yearMenuStyle");
    }

    /**
    * Style for the pop-up year menu.
    *
    * @param monthMenuStyle monthMenuStyle Default value is "dateChooserMonthMenu"
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setMonthMenuStyle(String monthMenuStyle)  throws IllegalStateException {
        setAttribute("monthMenuStyle", monthMenuStyle, false);
    }
    /**
     * Style for the pop-up year menu.
     *
     *
     * @return String
     *
     */
    public String getMonthMenuStyle()  {
        return getAttributeAsString("monthMenuStyle");
    }

    /**
    * Determines whether the "Today" button will be displayed, allowing the user to select &#010 the current date.
    *
    * @param showTodayButton showTodayButton Default value is true
    */
    public void setShowTodayButton(Boolean showTodayButton) {
        setAttribute("showTodayButton", showTodayButton, true);
    }
    /**
     * Determines whether the "Today" button will be displayed, allowing the user to select &#010 the current date.
     *
     *
     * @return Boolean
     *
     */
    public Boolean getShowTodayButton()  {
        return getAttributeAsBoolean("showTodayButton");
    }

    /**
    * Determines whether the "Cancel" button will be displayed.
    *
    * @param showCancelButton showCancelButton Default value is false
    */
    public void setShowCancelButton(Boolean showCancelButton) {
        setAttribute("showCancelButton", showCancelButton, true);
    }
    /**
     * Determines whether the "Cancel" button will be displayed.
     *
     *
     * @return Boolean
     *
     */
    public Boolean getShowCancelButton()  {
        return getAttributeAsBoolean("showCancelButton");
    }

    /**
    * Title for "Today" button.
    *
    * @param todayButtonTitle todayButtonTitle Default value is "Today"
    */
    public void setTodayButtonTitle(String todayButtonTitle) {
        setAttribute("todayButtonTitle", todayButtonTitle, true);
    }
    /**
     * Title for "Today" button.
     *
     *
     * @return String
     *
     */
    public String getTodayButtonTitle()  {
        return getAttributeAsString("todayButtonTitle");
    }

    /**
    * Title for the cancellation button.
    *
    * @param cancelButtonTitle cancelButtonTitle Default value is "Cancel"
    */
    public void setCancelButtonTitle(String cancelButtonTitle) {
        setAttribute("cancelButtonTitle", cancelButtonTitle, true);
    }
    /**
     * Title for the cancellation button.
     *
     *
     * @return String
     *
     */
    public String getCancelButtonTitle()  {
        return getAttributeAsString("cancelButtonTitle");
    }

    /**
    * If set specifies a fixed height for the Today and Cancel buttons.
    *
    * @param todayButtonHeight todayButtonHeight Default value is null
    */
    public void setTodayButtonHeight(Integer todayButtonHeight) {
        setAttribute("todayButtonHeight", todayButtonHeight, true);
    }
    /**
     * If set specifies a fixed height for the Today and Cancel buttons.
     *
     *
     * @return Integer
     *
     */
    public Integer getTodayButtonHeight()  {
        return getAttributeAsInt("todayButtonHeight");
    }

    /**
    * Whether it should be valid to pick a weekend day.  If set to true, weekend days appear&#010 in disabled style and cannot be picked. &#010 <P>&#010 Which days are considered weekends is controlled by {@link com.smartgwt.client..Date#weekendDays}.
    *
    * @param disableWeekends disableWeekends Default value is false
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setDisableWeekends(Boolean disableWeekends)  throws IllegalStateException {
        setAttribute("disableWeekends", disableWeekends, false);
    }
    /**
     * Whether it should be valid to pick a weekend day.  If set to true, weekend days appear&#010 in disabled style and cannot be picked. &#010 <P>&#010 Which days are considered weekends is controlled by {@link com.smartgwt.client..Date#weekendDays}.
     *
     *
     * @return Boolean
     *
     */
    public Boolean getDisableWeekends()  {
        return getAttributeAsBoolean("disableWeekends");
    }

    /**
    * Whether weekend days should be shown.  Which days are considered weekends is controlled&#010 by {@link com.smartgwt.client..Date#weekendDays}.
    *
    * @param showWeekends showWeekends Default value is true
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setShowWeekends(Boolean showWeekends)  throws IllegalStateException {
        setAttribute("showWeekends", showWeekends, false);
    }
    /**
     * Whether weekend days should be shown.  Which days are considered weekends is controlled&#010 by {@link com.smartgwt.client..Date#weekendDays}.
     *
     *
     * @return Boolean
     *
     */
    public Boolean getShowWeekends()  {
        return getAttributeAsBoolean("showWeekends");
    }

    /**
    * Day of the week to show in the first column.  0=Sunday, 1=Monday, ..., 6=Saturday.
    *
    * @param firstDayOfWeek firstDayOfWeek Default value is 0
    * @throws IllegalStateException this property cannot be changed after the component has been created
    */
    public void setFirstDayOfWeek(int firstDayOfWeek)  throws IllegalStateException {
        setAttribute("firstDayOfWeek", firstDayOfWeek, false);
    }
    /**
     * Day of the week to show in the first column.  0=Sunday, 1=Monday, ..., 6=Saturday.
     *
     *
     * @return int
     *
     */
    public int getFirstDayOfWeek()  {
        return getAttributeAsInt("firstDayOfWeek");
    }

    /**
    * Base css style applied to this picker's buttons. Will have "Over", "Selected" and "Down"&#010 suffix appended as the user interacts with buttons.
    *
    * @param baseButtonStyle baseButtonStyle Default value is "dateChooserButton"
    */
    public void setBaseButtonStyle(String baseButtonStyle) {
        setAttribute("baseButtonStyle", baseButtonStyle, true);
    }
    /**
     * Base css style applied to this picker's buttons. Will have "Over", "Selected" and "Down"&#010 suffix appended as the user interacts with buttons.
     *
     *
     * @return String
     *
     */
    public String getBaseButtonStyle()  {
        return getAttributeAsString("baseButtonStyle");
    }

    /**
    * Base css style applied to weekdays. Will have "Over", "Selected" and "Down"&#010 suffix appended as the user interacts with buttons.  Defaults to {@link com.smartgwt.client.widgets.DateChooser#getBaseButtonStyle baseButtonStyle}.
    *
    * @param baseWeekdayStyle baseWeekdayStyle Default value is null
    */
    public void setBaseWeekdayStyle(String baseWeekdayStyle) {
        setAttribute("baseWeekdayStyle", baseWeekdayStyle, true);
    }
    /**
     * Base css style applied to weekdays. Will have "Over", "Selected" and "Down"&#010 suffix appended as the user interacts with buttons.  Defaults to {@link com.smartgwt.client.widgets.DateChooser#getBaseButtonStyle baseButtonStyle}.
     *
     *
     * @return String
     *
     */
    public String getBaseWeekdayStyle()  {
        return getAttributeAsString("baseWeekdayStyle");
    }

    /**
    * Base css style applied to weekends. Will have "Over", "Selected" and "Down"&#010 suffix appended as the user interacts with buttons.  Defaults to {@link com.smartgwt.client.widgets.DateChooser#getBaseWeekdayStyle baseWeekdayStyle}.
    *
    * @param baseWeekendStyle baseWeekendStyle Default value is null
    */
    public void setBaseWeekendStyle(String baseWeekendStyle) {
        setAttribute("baseWeekendStyle", baseWeekendStyle, true);
    }
    /**
     * Base css style applied to weekends. Will have "Over", "Selected" and "Down"&#010 suffix appended as the user interacts with buttons.  Defaults to {@link com.smartgwt.client.widgets.DateChooser#getBaseWeekdayStyle baseWeekdayStyle}.
     *
     *
     * @return String
     *
     */
    public String getBaseWeekendStyle()  {
        return getAttributeAsString("baseWeekendStyle");
    }

    /**
    * Whether alternating weeks should be drawn in alternating styles. If enabled, the cell style&#010 for alternate rows will have {@link com.smartgwt.client.widgets.DateChooser#getAlternateStyleSuffix alternateStyleSuffix} appended to it.
    *
    * @param alternateWeekStyles alternateWeekStyles Default value is null
    */
    public void setAlternateWeekStyles(Boolean alternateWeekStyles) {
        setAttribute("alternateWeekStyles", alternateWeekStyles, true);
    }
    /**
     * Whether alternating weeks should be drawn in alternating styles. If enabled, the cell style&#010 for alternate rows will have {@link com.smartgwt.client.widgets.DateChooser#getAlternateStyleSuffix alternateStyleSuffix} appended to it.
     *
     *
     * @return Boolean
     *
     */
    public Boolean getAlternateWeekStyles()  {
        return getAttributeAsBoolean("alternateWeekStyles");
    }

    /**
    * The text appended to the style name when using {@link com.smartgwt.client.widgets.DateChooser#getAlternateWeekStyles alternateWeekStyles}.
    *
    * @param alternateStyleSuffix alternateStyleSuffix Default value is "Dark"
    */
    public void setAlternateStyleSuffix(String alternateStyleSuffix) {
        setAttribute("alternateStyleSuffix", alternateStyleSuffix, true);
    }
    /**
     * The text appended to the style name when using {@link com.smartgwt.client.widgets.DateChooser#getAlternateWeekStyles alternateWeekStyles}.
     *
     *
     * @return String
     *
     */
    public String getAlternateStyleSuffix()  {
        return getAttributeAsString("alternateStyleSuffix");
    }

    /**
    * CSS style applied to the day-of-week headers. By default this applies to all days of the &#010 week. To apply a separate style to weekend headers, set {@link com.smartgwt.client.widgets.DateChooser#getWeekendHeaderStyle weekendHeaderStyle}
    *
    * @param headerStyle headerStyle Default value is "dateChooserButtonDisabled"
    */
    public void setHeaderStyle(String headerStyle) {
        setAttribute("headerStyle", headerStyle, true);
    }
    /**
     * CSS style applied to the day-of-week headers. By default this applies to all days of the &#010 week. To apply a separate style to weekend headers, set {@link com.smartgwt.client.widgets.DateChooser#getWeekendHeaderStyle weekendHeaderStyle}
     *
     *
     * @return String
     *
     */
    public String getHeaderStyle()  {
        return getAttributeAsString("headerStyle");
    }

    /**
    * Optional CSS style applied to the day-of-week headers for weekend days. If unset &#010 {@link com.smartgwt.client.widgets.DateChooser#getHeaderStyle headerStyle} will be applied to both weekdays and weekend days.
    *
    * @param weekendHeaderStyle weekendHeaderStyle Default value is null
    */
    public void setWeekendHeaderStyle(String weekendHeaderStyle) {
        setAttribute("weekendHeaderStyle", weekendHeaderStyle, true);
    }
    /**
     * Optional CSS style applied to the day-of-week headers for weekend days. If unset &#010 {@link com.smartgwt.client.widgets.DateChooser#getHeaderStyle headerStyle} will be applied to both weekdays and weekend days.
     *
     *
     * @return String
     *
     */
    public String getWeekendHeaderStyle()  {
        return getAttributeAsString("weekendHeaderStyle");
    }

    /**
    * CSS style to apply to navigation buttons and date display at the top of the&#010 component. If null, the CSS style specified in {@link com.smartgwt.client.widgets.DateChooser#getBaseButtonStyle baseButtonStyle} is used.
    *
    * @param baseNavButtonStyle baseNavButtonStyle Default value is null
    */
    public void setBaseNavButtonStyle(String baseNavButtonStyle) {
        setAttribute("baseNavButtonStyle", baseNavButtonStyle, true);
    }
    /**
     * CSS style to apply to navigation buttons and date display at the top of the&#010 component. If null, the CSS style specified in {@link com.smartgwt.client.widgets.DateChooser#getBaseButtonStyle baseButtonStyle} is used.
     *
     *
     * @return String
     *
     */
    public String getBaseNavButtonStyle()  {
        return getAttributeAsString("baseNavButtonStyle");
    }

    /**
    * CSS style to apply to the buttons at the bottom of the DateChooser ("Today" and&#010 "Cancel").  If null, the CSS style specified in {@link com.smartgwt.client.widgets.DateChooser#getBaseButtonStyle baseButtonStyle} is used.
    *
    * @param baseBottomButtonStyle baseBottomButtonStyle Default value is null
    */
    public void setBaseBottomButtonStyle(String baseBottomButtonStyle) {
        setAttribute("baseBottomButtonStyle", baseBottomButtonStyle, true);
    }
    /**
     * CSS style to apply to the buttons at the bottom of the DateChooser ("Today" and&#010 "Cancel").  If null, the CSS style specified in {@link com.smartgwt.client.widgets.DateChooser#getBaseButtonStyle baseButtonStyle} is used.
     *
     *
     * @return String
     *
     */
    public String getBaseBottomButtonStyle()  {
        return getAttributeAsString("baseBottomButtonStyle");
    }

    // ********************* Methods ***********************

        /**
         * Set the picker to show the given date.&#010 &#010
         * @param date new value
         */
        public native void setData(Date date) /*-{
            var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
            self.setData(date);
        }-*/;

        /**
         * Get the current value of the picker.&#010 <P>&#010 See {@link com.smartgwt.client.widgets.DateChooser#addDataChangedHandler} for how to respond to the user picking a date.&#010&#010
         *
         * @return current date
         */
        public native Date getData() /*-{
            var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
            var retVal =self.getData();
            if(retVal == null || retVal === undefined) {
                return null;
            } else {
                return @com.smartgwt.client.util.JSOHelper::toDate(D)(retVal.getTime());
            }
        }-*/;

        /**
         * Add a dataChanged handler.
         * <p>
         * Method to override or observe in order to be notified when a user picks a date value.&#010 <P>&#010 Has no default behavior (so no need to call Super).&#010 <P>&#010 Use {@link com.smartgwt.client.widgets.DateChooser#getData} to get the current date value.&#010 &#010
         *
         * @param handler the dataChanged handler
         * @return {@link HandlerRegistration} used to remove this handler
         */
        public HandlerRegistration addDataChangedHandler(com.smartgwt.client.widgets.events.DataChangedHandler handler) {
            if(getHandlerCount(com.smartgwt.client.widgets.events.DataChangedEvent.getType()) == 0) setupDataChangedEvent();
            return doAddHandler(handler, com.smartgwt.client.widgets.events.DataChangedEvent.getType());
        }
        private native void setupDataChangedEvent() /*-{
            var obj = null;
            var selfJ = this;
            if(this.@com.smartgwt.client.widgets.BaseWidget::isCreated()()) {
                obj = this.@com.smartgwt.client.widgets.BaseWidget::getJsObj()();
                obj.addProperties({dataChanged:function(){
                        var param = {};
                        var event = @com.smartgwt.client.widgets.events.DataChangedEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                        selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                    }
                });
            } else {
                obj = this.@com.smartgwt.client.widgets.BaseWidget::getConfig()();
                obj.dataChanged = function(){
                    var param = {};
                    var event = @com.smartgwt.client.widgets.events.DataChangedEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(param);
                    selfJ.@com.smartgwt.client.widgets.BaseWidget::fireEvent(Lcom/google/gwt/event/shared/GwtEvent;)(event);
                };
            }
        }-*/;

        /**
         * Fired when the user clicks the cancel button in this date chooser. Default implementation&#010 clears the date chooser.&#010
         */
        public native void cancelClick() /*-{
            var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
            self.cancelClick();
        }-*/;

        /**
         * Fired when the user clicks the Today button. Default implementation will select the current&#010 date in the date chooser.&#010
         */
        public native void todayClick() /*-{
            var self = this.@com.smartgwt.client.widgets.BaseWidget::getOrCreateJsObj()();
            self.todayClick();
        }-*/;

    // ********************* Static Methods ***********************

}


