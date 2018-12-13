    {SPFILENOTIFY_ENDQUEUE}
     flq:           {SPFILENOTIFY_ENDQUEUE - exit(0x00000001)}
     flq:      {_commit_file_queue exit OK}
     ndv:      Registering CoInstallers...
     dvi:      {DIF_REGISTER_COINSTALLERS} 01:21:28.235
     dvi:           CoInstaller 1: Enter 01:21:28.235
     dvi:           CoInstaller 1: Exit
     dvi:           CoInstaller 2: Enter 01:21:28.235
     dvi:           CoInstaller 2: Exit
     dvi:           CoInstaller 3: Enter 01:21:28.235
     dvi:           CoInstaller 3: Exit
     dvi:           Class installer: Enter 01:21:28.235
     dvi:           Class installer: Exit
     dvi:           Default installer: Enter 01:21:28.235
     inf:                Opened PNF: 'c:\windows\system32\driverstore\filerepository\tdibth.inf_amd64_neutral_6ad685957123daf1\tdibth.inf' ([strings.0409])
     inf:                {Install Inf Section [RFCOMM.Install.CoInstallers]}
     inf:                {Install Inf Section [RFCOMM.Install.CoInstallers] exit (0x00000000)}
     dvi:                {DIF_DESTROYPRIVATEDATA} 01:21:28.235
     dvi:                     CoInstaller 1: Enter 01:21:28.235
     dvi:                     CoInstaller 1: Exit
     dvi:                     CoInstaller 2: Enter 01:21:28.235
     dvi:                     CoInstaller 2: Exit
     dvi:                     CoInstaller 3: Enter 01:21:28.235
     dvi:                     CoInstaller 3: Exit
     dvi:                     Class installer: Enter 01:21:28.235
     dvi:                     Class installer: Exit
     dvi:                {DIF_DESTROYPRIVATEDATA - exit(0x00000000)} 01:21:28.251
     dvi:                Co-installers registered.
     dvi:           Default installer: Exit
     dvi:      {DIF_REGISTER_COINSTALLERS - exit(0x00000000)} 01:21:28.251
     ndv:      Installing interfaces...
     dvi:      {DIF_INSTALLINTERFACES} 01:21:28.251
     dvi:           Using exported function 'NciDeviceInstall' in module 'C:\Windows\system32\nci.dll'.
     dvi:           CoInstaller 1 == nci.dll,NciDeviceInstall
     dvi:           Using exported function 'WlanDeviceClassCoInstaller' in module 'C:\Windows\system32\wlaninst.dll'.
     dvi:           CoInstaller 2 == wlaninst.dll,WlanDeviceClassCoInstaller
     dvi:           Using exported function 'WwanDeviceClassCoInstaller' in module 'C:\Windows\system32\wwaninst.dll'.
     dvi:           CoInstaller 3 == wwaninst.dll,WwanDeviceClassCoInstaller
     dvi:           CoInstaller 1: Enter 01:21:28.251
     dvi:           CoInstaller 1: Exit
     dvi:           CoInstaller 2: Enter 01:21:28.251
     dvi:           CoInstaller 2: Exit
     dvi:           CoInstaller 3: Enter 01:21:28.251
     dvi:           CoInstaller 3: Exit
     dvi:           Class installer: Enter 01:21:28.251
     dvi:           Class installer: Exit
     dvi:           Default installer: Enter 01:21:28.251
     dvi:                {Install INTERFACES}
     inf:                     Opened PNF: 'c:\windows\system32\driverstore\filerepository\tdibth.inf_amd64_neutral_6ad685957123daf1\tdibth.inf' ([strings.0409])
     dvi:                     Installing section [RFCOMM.Install.Interfaces]
     dvi:                {Install INTERFACES exit 00000000}
     dvi:           Default installer: Exit
     dvi:      {DIF_INSTALLINTERFACES - exit(0x00000000)} 01:21:28.251
     ndv:      Installing device...
     dvi:      {DIF_INSTALLDEVICE} 01:21:28.251
     dvi:           CoInstaller 1: Enter 01:21:28.251
     cci:                [NdisCoinst: Enter NcipHandleInstallPreProcessing]
     cci:                NdisCoinst: NetCfgInstanceId does not exist
     cci:                NdisCoinst: Guid of the adapter is {C4761522-353F-40F0-A66E-D4D18BFA29F7}
     inf:                Opened PNF: 'C:\Windows\INF\tdibth.inf' ([strings.0409])
     cci:                NdisCoinst: IfType from registry is 1
     cci:                NdisCoinst: IfType 1, Characteristics 0x9, IsIrdaDevice 0, PhysicalMediaType -1, MediaType -1, IsBridge 0, FoundGuidInDownlevel 0, EnableDhcp 2
     cci:       