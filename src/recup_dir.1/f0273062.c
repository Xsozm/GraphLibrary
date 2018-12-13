/**/phys_port_id r,
/sys/devices/**/**/net/**/dev_id r,
/sys/devices/virtual/net/**/phys_port_id r,
/sys/devices/virtual/net/**/dev_id r,

/dev/rfkill rw,

/run/udev/data/* r,

# Needed by the ifupdown plugin to check which interfaces can
# be managed an which not.
/etc/network/interfaces r,
# Needed for systemd's dhcp implementation
/etc/machine-id r,

#include <abstractions/nameservice>

# DBus accesses
#include <abstractions/dbus-strict>

dbus (send)
   bus=system
   path=/org/freedesktop/DBus
   interface=org.freedesktop.DBus
   member={Request,Release}Name
   peer=(name=org.freedesktop.DBus),

dbus (receive, send)
   bus=system
   path=/org/freedesktop/DBus
   interface=org.freedesktop.DBus
   member=GetConnectionUnixProcessID
   peer=(label=unconfined),

dbus (receive, send)
   bus=system
   path=/org/freedesktop/DBus
   interface=org.freedesktop.DBus
   member=GetConnectionUnixUser
   peer=(label=unconfined),

# Allow binding the service to the requested connection name
dbus (bind)
    bus=system
    name="org.freedesktop.NetworkManager",

# Allow traffic to/from our path and interface with any method
dbus (receive, send)
    bus=system
    path=/org/freedesktop/NetworkManager{,/**}
    interface=org.freedesktop.NetworkManager*,

# Allow traffic to/from org.freedesktop.DBus for NetworkManager service
dbus (receive, send)
    bus=system
    path=/org/freedesktop/NetworkManager{,/**}
    interface=org.freedesktop.DBus.*,

# Allow access to hostname system service
dbus (send)
    bus=system
    path=/org/freedesktop/hostname1
    interface=org.freedesktop.DBus.Properties
    peer=(label=unconfined),

# Sleep monitor inside NetworkManager needs this
dbus (send)
    bus=system
    path=/org/freedesktop/login1
    member=Inhibit
    interface=org.freedesktop.login1.Manager
    peer=(label=unconfined),
dbus (receive)
    bus=system
    path=/org/freedesktop/login1
    member=PrepareForSleep
    interface=org.freedesktop.login1.Manager
    peer=(label=unconfined),

# Allow access to wpa-supplicant for managing WiFi networks
dbus (receive, send)
    bus=system
    path=/fi/w1/wpa_supplicant1{,/**}
    interface=fi.w1.wpa_supplicant1*
    peer=(label=unconfined),
dbus (receive, send)
    bus=system
    path=/fi/w1/wpa_supplicant1{,/**}
    interface=org.freedesktop.DBus.*
    peer=(label=unconfined),
