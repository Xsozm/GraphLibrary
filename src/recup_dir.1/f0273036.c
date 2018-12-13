/sys/devices/**/bluetooth/**    rw,
  /sys/devices/**/id/chassis_type r,

  # TODO: use snappy hardware assignment for this once LP: #1498917 is fixed
  /dev/rfkill rw,

  # DBus accesses
  #include <abstractions/dbus-strict>
  dbus (send)
     bus=system
     path=/org/freedesktop/DBus
     interface=org.freedesktop.DBus
     member={Request,Release}Name
     peer=(name=org.freedesktop.DBus),

  dbus (send)
    bus=system
    path=/org/freedesktop/*
    interface=org.freedesktop.DBus.Properties
    peer=(label=unconfined),

  # Allow binding the service to the requested connection name
  dbus (bind)
      bus=system
      name="org.bluez",

  # Allow binding the service to the requested connection name
  dbus (bind)
      bus=system
      name="org.bluez.obex",

  # Allow traffic to/from our path and interface with any method
  dbus (receive, send)
      bus=system
      path=/org/bluez{,/**}
      interface=org.bluez.*,

  # Allow traffic to/from org.freedesktop.DBus for bluez service
  dbus (receive, send)
      bus=system
      path=/
      interface=org.freedesktop.DBus.**,
  dbus (receive, send)
      bus=system
      path=/org/bluez{,/**}
      interface=org.freedesktop.DBus.**,
