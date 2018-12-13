Q action=200 DoPruning=32
     flq:           ScanQ end Validity flags=620 CopyNodes=0
     dvi:      {_SCAN_FILE_QUEUE exit(0, 0x00000000)}
     ndv:      Committing file queue...
     flq:      {_commit_file_queue}
     flq:           CommitQ DelNodes=0 RenNodes=0 CopyNodes=0
     flq:           CommitQ early exit: No nodes are queued
     flq:      {_commit_file_queue exit OK}
     ndv:      Registering CoInstallers...
     dvi:      {DIF_REGISTER_COINSTALLERS} 01:20:19.798
     dvi:           CoInstaller 1: Enter 01:20:19.798
     dvi:           CoInstaller 1: Exit
     dvi:           CoInstaller 2: Enter 01:20:19.798
     dvi:           CoInstaller 2: Exit
     dvi:           CoInstaller 3: Enter 01:20:19.798
     dvi:           CoInstaller 3: Exit
     dvi:           Class installer: Enter 01:20:19.798
     dvi:           Class installer: Exit
     dvi:           Default installer: Enter 01:20:19.798
     inf:                Opened INF: 'c:\windows\inf\netrasa.inf' ([strings])
     inf:                {Install Inf Section [Ndi-Mp-Bh.CoInstallers]}
     inf:                {Install Inf Section [Ndi-Mp-Bh.CoInstallers] exit (0x00000000)}
     dvi:                {DIF_DESTROYPRIVATEDATA} 01:20:19.798
     dvi:                     CoInstaller 1: Enter 01:20:19.798
     dvi:                     CoInstaller 1: Exit
     dvi:                     CoInstaller 2: Enter 01:20:19.798
     dvi:                     CoInstaller 2: Exit
     dvi:                     CoInstaller 3: Enter 01:20:19.798
     dvi:                     CoInstaller 3: Exit
     dvi:                     Class installer: Enter 01:20:19.798
     dvi:                     Class installer: Exit
     dvi:                {DIF_DESTROYPRIVATEDATA - exit(0x00000000)} 01:20:19.798
     dvi:                Co-installers registered.
     dvi:           Default installer: Exit
     dvi:      {DIF_REGISTER_COINSTALLERS - exit(0x00000000)} 01:20:19.798
     ndv:      Installing interfaces...
     dvi:      {DIF_INSTALLINTERFACES} 01:20:19.798
     dvi:           Using exported function 'NciDeviceInstall' in module 'C:\Windows\system32\nci.dll'.
     dvi:           CoInstaller 1 == nci.dll,NciDeviceInstall
     dvi:           Using exported function 'WlanDeviceClassCoInstaller' in module 'C:\Windows\system32\wlaninst.dll'.
     dvi:           CoInstaller 2 == wlaninst.dll,WlanDeviceClassCoInstaller
     dvi:           Using exported function 'WwanDeviceClassCoInstaller' in module 'C:\Windows\system32\wwaninst.dll'.
     dvi:           CoInstaller 3 == wwaninst.dll,WwanDeviceClassCoInstaller
     dvi:           CoInstaller 1: Enter 01:20:19.798
     dvi:           CoInstaller 1: Exit
     dvi:           CoInstaller 2: Enter 01:20:19.798
     dvi:           CoInstaller 2: Exit
     dvi:           CoInstaller 3: Enter 01:20:19.798
     dvi:           CoInstaller 3: Exit
     dvi:           Class installer: Enter 01:20:19.798
     dvi:           Class installer: Exit
     dvi:           Default installer: Enter 01:20:19.798
     dvi:                {Install INTERFACES}
     inf:                     Opened INF: 'c:\windows\inf\netrasa.inf' ([strings])
     dvi:                     Installing section [Ndi-Mp-Bh.Interfaces]
     dvi:                {Install INTERFACES exit 00000000}
     dvi:           Default installer: Exit
     dvi:      {DIF_INSTALLINTERFACES - exit(0x00000000)} 01:20:19.798
     ndv:      Installing device...
     dvi:      {DIF_INSTALLDEVICE} 01:20:19.798
     dvi:           CoInstaller 1: Enter 01:20:19.798
     cci:                [NdisCoinst: Enter NcipHandleInstallPreProcessing]
     cci:                NdisCoinst: Guid of the adapter exists and is {5BF54C7E-91DA-457D-80BF-333677D7E316}
     inf:                Opened INF: 'c:\windows\inf\netrasa.inf' ([strings])
     cci:                NdisCoinst: IfType from registry is 6
     cci:                NdisCoinst: IfType 6, Characteristics 0x29, IsIrdaDevice 0, PhysicalMediaType -1, MediaType -1, IsBridge 0, FoundGuidInDownlevel 0, EnableDhcp