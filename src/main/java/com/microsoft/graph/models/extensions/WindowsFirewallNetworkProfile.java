// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.StateManagementSetting;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Firewall Network Profile.
 */
public class WindowsFirewallNetworkProfile implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Firewall Enabled.
     * Configures the host device to allow or block the firewall and advanced security enforcement for the network profile. Possible values are: notConfigured, blocked, allowed.
     */
    @SerializedName("firewallEnabled")
    @Expose
    public StateManagementSetting firewallEnabled;

    /**
     * The Stealth Mode Blocked.
     * Prevent the server from operating in stealth mode. When StealthModeRequired and StealthModeBlocked are both true, StealthModeBlocked takes priority.
     */
    @SerializedName("stealthModeBlocked")
    @Expose
    public Boolean stealthModeBlocked;

    /**
     * The Incoming Traffic Blocked.
     * Configures the firewall to block all incoming traffic regardless of other policy settings. When IncomingTrafficRequired and IncomingTrafficBlocked are both true, IncomingTrafficBlocked takes priority.
     */
    @SerializedName("incomingTrafficBlocked")
    @Expose
    public Boolean incomingTrafficBlocked;

    /**
     * The Unicast Responses To Multicast Broadcasts Blocked.
     * Configures the firewall to block unicast responses to multicast broadcast traffic. When UnicastResponsesToMulticastBroadcastsRequired and UnicastResponsesToMulticastBroadcastsBlocked are both true, UnicastResponsesToMulticastBroadcastsBlocked takes priority.
     */
    @SerializedName("unicastResponsesToMulticastBroadcastsBlocked")
    @Expose
    public Boolean unicastResponsesToMulticastBroadcastsBlocked;

    /**
     * The Inbound Notifications Blocked.
     * Prevents the firewall from displaying notifications when an application is blocked from listening on a port. When InboundNotificationsRequired and InboundNotificationsBlocked are both true, InboundNotificationsBlocked takes priority.
     */
    @SerializedName("inboundNotificationsBlocked")
    @Expose
    public Boolean inboundNotificationsBlocked;

    /**
     * The Authorized Application Rules From Group Policy Merged.
     * Configures the firewall to merge authorized application rules from group policy with those from local store instead of ignoring the local store rules. When AuthorizedApplicationRulesFromGroupPolicyNotMerged and AuthorizedApplicationRulesFromGroupPolicyMerged are both true, AuthorizedApplicationRulesFromGroupPolicyMerged takes priority.
     */
    @SerializedName("authorizedApplicationRulesFromGroupPolicyMerged")
    @Expose
    public Boolean authorizedApplicationRulesFromGroupPolicyMerged;

    /**
     * The Global Port Rules From Group Policy Merged.
     * Configures the firewall to merge global port rules from group policy with those from local store instead of ignoring the local store rules. When GlobalPortRulesFromGroupPolicyNotMerged and GlobalPortRulesFromGroupPolicyMerged are both true, GlobalPortRulesFromGroupPolicyMerged takes priority.
     */
    @SerializedName("globalPortRulesFromGroupPolicyMerged")
    @Expose
    public Boolean globalPortRulesFromGroupPolicyMerged;

    /**
     * The Connection Security Rules From Group Policy Merged.
     * Configures the firewall to merge connection security rules from group policy with those from local store instead of ignoring the local store rules. When ConnectionSecurityRulesFromGroupPolicyNotMerged and ConnectionSecurityRulesFromGroupPolicyMerged are both true, ConnectionSecurityRulesFromGroupPolicyMerged takes priority.
     */
    @SerializedName("connectionSecurityRulesFromGroupPolicyMerged")
    @Expose
    public Boolean connectionSecurityRulesFromGroupPolicyMerged;

    /**
     * The Outbound Connections Blocked.
     * Configures the firewall to block all outgoing connections by default. When OutboundConnectionsRequired and OutboundConnectionsBlocked are both true, OutboundConnectionsBlocked takes priority.
     */
    @SerializedName("outboundConnectionsBlocked")
    @Expose
    public Boolean outboundConnectionsBlocked;

    /**
     * The Inbound Connections Blocked.
     * Configures the firewall to block all incoming connections by default. When InboundConnectionsRequired and InboundConnectionsBlocked are both true, InboundConnectionsBlocked takes priority.
     */
    @SerializedName("inboundConnectionsBlocked")
    @Expose
    public Boolean inboundConnectionsBlocked;

    /**
     * The Secured Packet Exemption Allowed.
     * Configures the firewall to allow the host computer to respond to unsolicited network traffic of that traffic is secured by IPSec even when stealthModeBlocked is set to true. When SecuredPacketExemptionBlocked and SecuredPacketExemptionAllowed are both true, SecuredPacketExemptionAllowed takes priority.
     */
    @SerializedName("securedPacketExemptionAllowed")
    @Expose
    public Boolean securedPacketExemptionAllowed;

    /**
     * The Policy Rules From Group Policy Merged.
     * Configures the firewall to merge Firewall Rule policies from group policy with those from local store instead of ignoring the local store rules. When PolicyRulesFromGroupPolicyNotMerged and PolicyRulesFromGroupPolicyMerged are both true, PolicyRulesFromGroupPolicyMerged takes priority.
     */
    @SerializedName("policyRulesFromGroupPolicyMerged")
    @Expose
    public Boolean policyRulesFromGroupPolicyMerged;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
