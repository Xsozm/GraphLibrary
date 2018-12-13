S exit 00000000}
     dvi:           Default installer: Exit
     dvi:      {DIF_INSTALLINTERFACES - exit(0x00000000)} 01:27:17.870
     ndv:      Installing device...
     dvi:      {DIF_INSTALLDEVICE} 01:27:17.870
     dvi:           No class installer for 'Generic volume shadow copy'
     dvi:           Default installer: Enter 01:27:17.870
     dvi:                {Install DEVICE}
     inf:                     Opened PNF: 'c:\windows\system32\driverstore\filerepository\volsnap.inf_amd64_neutral_7499a4fac85b39fc\volsnap.inf' ([strings.0409])
     dvi:                     Processing Registry/Property directives...
     inf:                     {Install Inf Section [volume_snapshot_install.NTAMD64]}
     inf:                     {Install Inf Section [volume_snapshot_install.NTAMD64] exit (0x00000000)}
     inf:                     {Install Inf Section [volume_snapshot_install.NTAMD64.Hw]}
     inf:                          Empty section
     inf:                     {Install Inf Section [volume_snapshot_install.NTAMD64.Hw] exit (0x00000000)}
     dvi:                     {Writing Device Properties}
     dvi:                          Provider name=Microsoft
     dvi:                          DriverDate 06/21/2006
     dvi:                          DriverVersion=6.1.7600.16385
     dvi:                          Class name=VolumeSnapshot
     dvi:                          Manufacturer=Microsoft
     dvi:                          Matching DeviceID=storage\volumesnapshot
     dvi:                          Strong Name=volsnap.inf:MSFT.NTamd64:volume_snapshot_install:6.1.7600.16385:storage\volumesnapshot
     dvi:                     {Writing Device Properties - Complete}
     inf:                     {Install Inf Section [volume_snapshot_install.NTAMD64.Services]}
     inf:                          AddService=,2,  (volsnap.inf line 31)
!    dvi:                          Add Service: NULL Controlling service.
     inf:                     {Install Inf Section [volume_snapshot_install.NTAMD64.Services] exit(0x00000000)}
     dvi:                     Updated reflected section names for: volsnap.inf
     dvi:                {Install DEVICE exit (0x00000000)}
     dvi:                Writing common driver property settings.
     dvi:                     DriverDescription=Generic volume shadow copy
     dvi:                     DeviceDisplayName=Generic volume shadow copy
     dvi:                Install Device: Removing device sub-tree. 01:27:17.886
     dvi:                Install Device: Removing device sub-tree completed. 01:27:18.026
     dvi:                Install Device: Restarting device. 01:27:18.026
     dvi:                Install Device: Restarting device completed. 01:27:18.245
     dvi:           Default installer: Exit
     dvi:      {DIF_INSTALLDEVICE - exit(0x00000000)} 01:27:18.245
     dvi:      {DIF_NEWDEVICEWIZARD_FINISHINSTALL} 01:27:18.245
     dvi:           No class installer for 'Generic volume shadow copy'
     dvi:           Default installer: Enter 01:27:18.245
     dvi:           Default installer: Exit
     dvi:      {DIF_NEWDEVICEWIZARD_FINISHINSTALL - exit(0xe000020e)} 01:27:18.245
     ndv:      Device install status=0x00000000
     ndv:      Performing device install final cleanup...
     ndv: {Core Device Install - exit(0x00000000)} 01:27:18.245
     ump: Server install process exited with code 0x00000000 01:27:18.260
<<<  Section end 2015/09/25 01:27:18.260
<<<  [Exit status: SUCCESS]


>>>  [Device Install (Hardware initiated) - STORAGE\VolumeSnapshot\HarddiskVolumeSnapshot3]
>>>  Section start 2015/09/25 01:28:01.424
     ump: Creating Install Process: DrvInst.exe 01:28:01.424
     ndv: Retrieving device info...
     ndv: Setting device parameters...
     ndv: Searching Driver Store and Device Path...
     dvi: {Build Driver List} 01:28:01.549
     dvi:      Searching for hardware ID(s):
     dvi:           storage\volumesnapshot
     cpy:      Policy is set to make all digital signatures equal.
     dvi:      Enumerating INFs from