ved

#include <abstractions/dbus-strict>

# Allow all access to bluez service
dbus (receive, send)
    bus=system
    peer=(label=###SLOT_SECURITY_TAGS###),

dbus (send)
    bus=system
    peer=(name=org.bluez, label=unconfined),

dbus (send)
    bus=system
    peer=(name=org.bluez.obex, label=unconfined),

dbus (receive)
    bus=system
    path=/
    interface=org.freedesktop.DBus.ObjectManager
    peer=(label=unconfined),

dbus (receive)
    bus=system
    path=/org/bluez{,/**}
    interface=org.freedesktop.DBus.*
    peer=(label=unconfined),
