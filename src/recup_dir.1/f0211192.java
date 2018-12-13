 2
     cci:                NdisCoinst: Connection name is Local Area Connection* 7
     cci:                NdisCoinst: NetLuidIndex exists and is 1
     cci:                [NdisCoinst: Exit NcipHandleInstallPreProcessing]
     dvi:           CoInstaller 1: Exit
     dvi:           CoInstaller 2: Enter 01:20:19.798
     inf:                Opened INF: 'c:\windows\inf\netrasa.inf' ([strings])
     dvi:           CoInstaller 2: Exit
     dvi:           CoInstaller 3: Enter 01:20:19.813
     inf:                Opened INF: 'c:\windows\inf\netrasa.inf' ([strings])
     dvi:           CoInstaller 3: Exit
     dvi:           Class installer: Enter 01:20:19.813
     cci:                [NCI BEGIN INSTALL DEVICE for ROOT\MS_NDISWANBH\0000]
     inf:                Opened INF: 'c:\windows\inf\netrasa.inf' ([strings])
     cci:                NCI: NewDeviceInstall is 0. Assuming this is an update
     inf:                AddReg=Ndi-Reg-Mp-Bh  (netrasa.inf line 85)
     dvi:                {Install DEVICE}
     inf:                     Opened INF: 'c:\windows\inf\netrasa.inf' ([strings])
     dvi:                     Writing BASIC Logical Configurations...
     inf:                     {Install Inf Section [Ndi-Mp-Bh]}
     inf:                     {Install Inf Section [Ndi-Mp-Bh] exit (0x00000000)}
     dvi:                     Processing Registry/Property directives...
     inf:                     {Install Inf Section [Ndi-Mp-Bh]}
     inf:                          AddReg=Ndi-Reg-Mp-Bh  (netrasa.inf line 85)
     inf:                     {Install Inf Section [Ndi-Mp-Bh] exit (0x00000000)}
     inf:                     {Install Inf Section [Ndi-Mp-Bh.Hw]}
     inf:                          AddReg=Reg-LowerFilter-NdisTapi  (netrasa.inf line 88)
     inf:                     {Install Inf Section [Ndi-Mp-Bh.Hw] exit (0x00000000)}
     dvi:                     {Writing Device Properties}
     dvi:                          Provider name=Microsoft
     dvi:                          DriverDate 06/21/2006
     dvi:                          DriverVersion=6.1.7600.16385
     dvi:                          Class name=Net
     dvi:                          Manufacturer=Microsoft
     dvi:                          Matching DeviceID=ms_ndiswanbh
     dvi:                     {Writing Device Properties - Complete}
     inf:                     {Install Inf Section [Ndi-Mp-Bh.Services]}
     inf:                          AddService=NdisWan,2,Svc-Mp-NdisWan,Evt-Rasmsg  (netrasa.inf line 269)
     inf:                          ServiceType=1  (netrasa.inf line 319)
     inf:                          StartType=3  (netrasa.inf line 320)
     inf:                          ErrorControl=1  (netrasa.inf line 321)
     inf:                          ServiceBinary=C:\Windows\system32\DRIVERS\ndiswan.sys  (netrasa.inf line 322)
     inf:                          DisplayName=@%systemroot%\system32\rascfg.dll,-32002  (netrasa.inf line 317)
     inf:                          Description=@%systemroot%\system32\rascfg.dll,-32002  (netrasa.inf line 325)
     dvi:                          Add Service: Modified existing service 'NdisWan'.
     inf:                          AddReg=Reg-NdisWan  (netrasa.inf line 324)
     inf:                          AddReg=Evt-Rasmsg-AddReg  (netrasa.inf line 384)
     inf:                          AddService=NdisTapi,0,Svc-NdisTapi  (netrasa.inf line 270)
     inf:                          ServiceType=1  (netrasa.inf line 306)
     inf:                          StartType=3  (netrasa.inf line 307)
     inf:                          ErrorControl=1  (netrasa.inf line 308)
     inf:                          ServiceBinary=C:\Windows\system32\DRIVERS\ndistapi.sys  (netrasa.inf line 309)
     inf:                          DisplayName=@%systemroot%\system32\rascfg.dll,-32001  (netrasa.inf line 305)
     inf:                          Description=@%systemroot%\system32\rascfg.dll,-32001  (netrasa.inf line 311)
     dvi:                          Add Service: Modified existing service 'Ndier      - [Microsoft Windows]
     dvi:                     Rank        - [0x00ff0001]
     dvi:           {Select Best Driver - exit(0x00000000)}
     dvi:      Default installer: Exit
     dvi: {DIF_SELECTBESTCOMPATDRV - exit(0x00000000)} 01:18:45.667
     inf: {SetupCopyOEMInf: C:\Windows\INF\acpi.inf} 01:18:45.667
     inf:      Driver Store location: C:\Windows\System32\DriverStore\FileRepository\acpi.inf_amd64_neutral_2a841284c9de8962\acpi.inf
     inf:      Published Inf Path: C:\Windows\INF\acpi.inf
     inf: {SetupCopyOEMInf exit (0x00000050)} 01:18:45.667
     dvi: Searching for hardware ID(s):
     dvi:      acpi\pnp0c14
     dvi:      *pnp0c14
     inf: Opened PNF: 'C:\Windows\System32\DriverStore\FileRepository\acpi.inf_amd64_neutral_2a841284c9de8962\acpi.inf' ([strings.0409])
     dvi: Selected driver installs from section [WMIMAP_Inst] in 'c:\windows\system32\driverstore\filerepository\acpi.inf_amd64_neutral_2a841284c9de8962\acpi.inf'.
     dvi: Class GUID of device remains: {4d36e97d-e325-11ce-bfc1-08002be10318}.
     dvi: Set selected driver complete.
     ndv: Driver selected, now performing install...
     ndv: Waiting for previous device install to complete. 01:18:45.667
     ndv: {Core Device Install} 01:18:46.042
     inf:      Opened INF: 'C:\Windows\INF\acpi.inf' ([strings.0409])
     inf:      Saved PNF: 'C:\Windows\INF\acpi.PNF' (Language = 0409)
     inf:      Opened PNF: 'C:\Windows\INF\acpi.inf' ([strings.0409])
     dvi:      {DIF_ALLOW_INSTALL} 01:18:46.042
     dvi:           No class installer for 'Microsoft Windows Management Interface for ACPI'
     dvi:           CoInstaller 1: Enter 01:18:46.042
     dvi:           CoInstaller 1: Exit
     dvi:           Default installer: Enter 01:18:46.042
     dvi:           Default installer: Exit
     dvi:      {DIF_ALLOW_INSTALL - exit(0xe000020e)} 01:18:46.042
     ndv:      Installing files...
     dvi:      {DIF_INSTALLDEVICEFILES} 01:18:46.042
     dvi:           No class installer for 'Microsoft Windows Management Interface for ACPI'
     dvi:           CoInstaller 1: Enter 01:18:46.042
     dvi:           CoInstaller 1: Exit
     dvi:           Default installer: Enter 01:18:46.042
     dvi:                {Install FILES}
     inf:                     Opened PNF: 'c:\windows\system32\driverstore\filerepository\acpi.inf_amd64_neutral_2a841284c9de8962\acpi.inf' ([strings.0409])
     inf:                     {Install Inf Section [WMIMAP_Inst.NT]}
     inf:                          Copyfiles=WmiAcpiCopyFiles  (acpi.inf line 69)
     flq:                          CopyFiles from an inbox inf.
     cpy:                          Open PnpLockdownPolicy: Err=2. This is OK. Use LockDownPolicyDefault
     flq:                          QueueSingleCopy...
     flq:                          Inf     : 'c:\windows\system32\driverstore\filerepository\acpi.inf_amd64_neutral_2a841284c9de8962\acpi.inf'
     flq:                          SourceInf: 'c:\windows\system32\driverstore\filerepository\acpi.inf_amd64_neutral_2a841284c9de8962\acpi.inf'
     flq:                          SourceSection: [sourcedisksfiles]
     flq:                          Source root path based on SourceInf
     flq:                          SourceRootPath: 'C:\Windows\System32\DriverStore\FileRepository\acpi.inf_amd64_neutral_2a841284c9de8962'
     flq:                          {FILE_QUEUE_COPY}
     flq:                               CopyStyle      - 0x09000000
     flq:                               {FILE_QUEUE_COPY}
     flq:                                    CopyStyle      - 0x09000000
     flq:                                    SourceRootPath - 'C:\Windows\System32\DriverStore\FileRepository\acpi.inf_amd64_neutral_2a841284c9de8962'
     flq:                                    SourceFilename - 'wmiacpi.sys'
     flq:                                    TargetDirectory- 'C:\Windows\system32\DRIVERS'
     flq:                                    TargetFilename - 'wmiacpi.sys'
     flq:                                    SourceDes