SECURITY_TAGS###),

dbus (receive)
    bus=system
    path=/sessions/*
    interface=com.ubuntu.location.Service.Session
    member="{Start,Stop}HeadingUpdates"
    peer=(label=###PLUG_SECURITY_TAGS###),

dbus (receive)
    bus=system
    path=/sessions/*
    interface=com.ubuntu.location.Service.Session
    member="{Start,Stop}VelocityUpdates"
    peer=(label=###PLUG_SECURITY_TAGS###),

# Allow the service to send updates to clients
dbus (send)
    bus=system
    path=/sessions/*
    interface=com.ubuntu.location.Service.Session
    member="Update{Position,Heading,Velocity}"
    peer=(label=###PLUG_SECURITY_TAGS###),

dbus (send)
    bus=system
    path=/com/ubuntu/location/Service
    interface=org.freedesktop.DBus.Properties
    member=PropertiesChanged
    peer=(label=###PLUG_SECURITY_TAGS###),
