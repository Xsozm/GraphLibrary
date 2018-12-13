
     dvi:      Created Driver Node:
     dvi:           HardwareID   - HDAUDIO\FUNC_01
     dvi:           InfName      - C:\Windows\System32\DriverStore\FileRepository\hdaudio.inf_amd64_neutral_cb351613c92a9f31\hdaudio.inf
     dvi:           DevDesc      - High Definition Audio Device
     dvi:           DrvDesc      - High Definition Audio Device
     dvi:           Provider     - Microsoft
     dvi:           Mfg          - Microsoft
     dvi:           ModelsSec    - Microsoft.ntamd64
     dvi:           InstallSec   - HdAudModel
     dvi:           ActualSec    - HdAudModel
     dvi:           Rank         - 0x00ff300c
     dvi:           Signer       - Microsoft Windows
     dvi:           Signer Score - INBOX
     dvi:           DrvDate      - 07/13/2009
     dvi:           Version      - 6.1.7600.16385
     inf:      Searched 1 potential matches in published INF directory
     inf:      Searched 35 INFs in directory: 'C:\Windows\inf'
     dvi: {Build Driver List - exit(0x00000000)} 01:21:02.136
     ndv: Selecting best match from Driver Store (including Device Path)...
     dvi: {DIF_SELECTBESTCOMPATDRV} 01:21:02.136
     dvi:      Using exported function 'MediaClassInstaller' in module 'C:\Windows\system32\mmci.dll'.
     dvi:      Class installer == mmci.dll,MediaClassInstaller
     dvi:      Using exported function 'MediaClassCoInstaller' in module 'C:\Windows\system32\mmcico.dll'.
     dvi:      CoInstaller 1 == mmcico.dll,MediaClassCoInstaller
     dvi:      CoInstaller 1: Enter 01:21:02.183
     dvi:      CoInstaller 1: Exit
     dvi:      Class installer: Enter 01:21:02.183
     inf:           Opened INF: 'C:\Windows\INF\hdaudio.inf' ([strings.0409])
     inf:           Saved PNF: 'C:\Windows\INF\hdaudio.PNF' (Language = 0409)
     dvi:      Class installer: Exit
     dvi:      Default installer: Enter 01:21:02.214
     dvi:           {Select Best Driver}
     dvi:                Selected driver installs from section [HdAudModel] in 'c:\windows\system32\driverstore\filerepository\hdaudio.inf_amd64_neutral_cb351613c92a9f31\hdaudio.inf'.
     dvi:                Class GUID of device changed to: {4d36e96c-e325-11ce-bfc1-08002be10318}.
     dvi:                {DIF_DESTROYPRIVATEDATA} 01:21:02.277
     dvi:                     CoInstaller 1: Enter 01:21:02.277
     dvi:                     CoInstaller 1: Exit
     dvi:                     Class installer: Enter 01:21:02.277
     dvi:                     Class installer: Exit
     dvi:                     Default installer: Enter 01:21:02.277
     dvi:                     Default installer: Exit
     dvi:                {DIF_DESTROYPRIVATEDATA - exit(0xe000020e)} 01:21:02.277
     dvi:                Set selected driver complete.
     dvi:                Selected:
     dvi:                     Description - [High Definition Audio Device]
     dvi:                     InfFile     - [c:\windows\system32\driverstore\filerepository\hdaudio.inf_amd64_neutral_cb351613c92a9f31\hdaudio.inf]
     dvi:                     Section     - [HdAudModel]
     dvi:                     Signer      - [Microsoft Windows]
     dvi:                     Rank        - [0x00ff300c]
     dvi:           {Select Best Driver - exit(0x00000000)}
     dvi:      Default installer: Exit
     dvi: {DIF_SELECTBESTCOMPATDRV - exit(0x00000000)} 01:21:02.277
     inf: {SetupCopyOEMInf: C:\Windows\INF\hdaudio.inf} 01:21:02.277
     inf:      Driver Store location: C:\Windows\System32\DriverStore\FileRepository\hdaudio.inf_amd64_neutral_cb351613c92a9f31\hdaudio.inf
     inf:      Published Inf Path: C:\Windows\INF\hdaudio.inf
     inf: {SetupCopyOEMInf exit (0x00000050)} 01:21:02.277
     dvi: Searching for hardware ID(s):
     dvi:      hdaudio\func_01&ven_10ec&dev_0236&subsys_17aa3808&rev_1000
     dvi:      hdaudio\func_01&ven_10ec&dev_0236&subsys_17aa3808
     dvi: Searching for compatible ID(s):
     dvi:      hdaudio\func_01&ctlr_ven_8086&ctlr_dev_9ca0&ven_10ec&dev_0236&rev_1000
     dvi:      hdaudio\func_01&ctlr_ven_8086&ven_10ec&dev_0236&rev_1000
     dvi:      hdaudio\func_01&ven_10ec&dev_0236&rev_1000
     dvi:      hdaudio\func_01&ctlr_ven_8086&ctlr_dev_9ca0&ven_10ec&dev_0236
     dvi:      hdaudio\func_01&ctlr_ven_8086&ven_10ec&dev_0236
     dvi:      hdaudio\func_01&ven_10ec&dev_0236
     dvi:      hdaudio\func_01&ctlr_ven_8086&ctlr_dev_9ca0&ven_10ec
     dvi:      hdaudio\func_01&ctlr_ven_8086&ven_10ec
     dvi:      hdaudio\func_01&ven_10ec
     dvi:      hdaudio\func_01&ctlr_ven_8086&ctlr_dev_9ca0
     dvi:      hdaudio\func_01&ctlr_ven_8086
     dvi:      hdaudio\func_01&gf&ven_10ec&dev_0236&subsys_17aa3808&rev_1000
     dvi:      hdaudio\func_01
     inf: Opened PNF: 'C:\Windows\System32\DriverStore\FileRepository\hdaudio.inf_amd64_neutral_cb351613c92a9f31\hdaudio.inf' ([strings.0409])
     dvi: Selected driver installs from section [HdAudModel] in 'c:\windows\system32\driverstore\filerepository\hdaudio.inf_amd64_neutral_cb351613c92a9f31\hdaudio.inf'.
     dvi: Class GUID of device changed to: {4d36e96c-e325-11ce-bfc1-08002be10318}.
     dvi: Set selected driver complete.
     ndv: Driver selected, now performing install...
     ndv: Waiting for previous device install to complete. 01:21:02.277
     ndv: {Core Device Install} 01:21:04.851
     inf:      Opened PNF: 'C:\Windows\INF\hdaudio.inf' ([strings.0409])
!    pol:      Selected driver node does not match this device (force-install)
     inf:      Opened PNF: 'C:\Windows\INF\hdaudio.inf' ([strings.0409])
     dvi:      {DIF_ALLOW_INSTALL} 01:21:04.851
     dvi:           Using exported function 'MediaClassInstaller' in module 'C:\Windows\system32\mmci.dll'.
     dvi:           Class installer == mmci.dll,MediaClassInstaller
     dvi:           Using exported function 'MediaClassCoInstaller' in module 'C:\Windows\system32\mmcico.dll'.
     dvi:           CoInstaller 1 == mmcico.dll,MediaClassCoInstaller
     dvi:           CoInstaller 1: Enter 01:21:04.851
     dvi:           CoInstaller 1: Exit
     dvi:           Class installer: Enter 01:21:04.851
     inf:                Opened PNF: 'C:\Windows\INF\hdaudio.inf' ([strings.0409])
     dvi:           Class installer: Exit
     dvi:           Default installer: Enter 01:21:04.851
     dvi:           Default installer: Exit
     dvi:      {DIF_ALLOW_INSTALL - exit(0xe000020e)} 01:21:04.851
     ndv:      Installing files...
     dvi:      {DIF_INSTALLDEVICEFILES} 01:21:04.851
     dvi:           CoInstaller 1: Enter 01:21:04.851
     dvi:           CoInstaller 1: Exit
     dvi:           Class installer: Enter 01:21:04.851
     dvi:           Class installer: Exit
     dvi:           Default installer: Enter 01:21:04.851
     dvi:                {Install FILES}
     inf:                     Opened PNF: 'c:\windows\system32\driverstore\filerepository\hdaudio.inf_amd64_neutral_cb351613c92a9f31\hdaudio.inf' ([strings.0409])
     inf:                     Opened INF: 'C:\Windows\INF\ks.inf' ([strings.0409])
     inf:                     Saved PNF: 'C:\Windows\INF\ks.PNF' (Language = 0409)
     inf:                     Opened INF: 'C:\Windows\INF\wdmaudio.inf' ([strings.0409])
     inf:                     Saved PNF: 'C:\Windows\INF\wdmaudio.PNF' (Language = 0409)
     inf:                     {Install Inf Section [HdAudModel]}
     inf:                          CopyFiles=HdAudModel.CopyList  (hdaudio.inf line 52)
     flq:                          CopyFiles from an inbox inf.
     cpy:                          Open PnpLockdownPolicy: Err=2. This is OK. Use LockDownPolicyDefault
     flq:                          QueueSingleCopy...
     flq:                          Inf     : 'c:\windows\system32\driverstore\filerepository\hdaudio.inf_amd64_neutral_cb351613c92a9f31\hdaudio.inf'
     flq:                          SourceInf: 'c:\windows\system32\driverstore\filerepository\hdaudio.inf_amd64_neutral_cb351613c92a9f31\hdaudio.inf'
     flq:                          SourceSection: [sourcedisksfiles]
     flq:                          Source root path based on SourceInf
     flq:                          SourceRootPath: 'C:\Windows\System32\DriverStore\FileRepository\hdaudio.inf_amd64_neutral_cb351613c92a9f31'
     flq:                          {FILE_QUEUE_COPY}
     flq:                               CopyStyle      - 0x0b000000
     flq:                               {FILE_QUEUE_COPY}
     flq:                                    CopyStyle      - 0x0b000000
     flq:                                    SourceRootPath - 'C:\Windows\System32\DriverStore\FileRepository\hdaudio.inf_amd64_neutral_cb351613c92a9f31'
     flq:                                    SourceFilename - 'HdAudio.sys'
     flq:                                    TargetDirectory- 'C:\Windows\system32\drivers'
     flq:                                    TargetFilename - 'HdAudio.sys'
     flq:                                    SourceDesc     - 'windows cd'
     flq:                               {FILE_QUEUE_COPY exit(0x00000000)}
     flq:                          {FILE_QUEUE_COPY exit(0x00000000)}
     inf:                     {Install Inf Section [HdAudModel] exit (0x00000000)}
     inf:                     {Install Inf Section [KS.Registration]}
     inf:                          CopyFiles=KSProxy.Files,KSDriver.Files  (ks.inf line 12)
!    inf:                          Empty Section! [KSProxy.Files]
!    inf:                          Empty Section! [KSDriver.Files]
     inf:                          DelFiles=KSProxy.DelFiles  (ks.inf line 13)
!    inf:                          Empty Section! [KSProxy.DelFiles]
     inf:                     {Install Inf Section [KS.Registration] exit (0x00000000)}
     inf:                     {Install Inf Section [WDMAUDIO.Registration]}
     inf:                          CopyFiles=WDM.CopyFiles  (wdmaudio.inf line 55)
     flq:                          CopyFiles from an inbox inf.
     flq:                          QueueSingleCopy...
     flq:                          Inf     : 'c:\windows\system32\driverstore\filerepository\hdaudio.inf_amd64_neutral_cb351613c92a9f31\hdaudio.inf'
     flq:                          SourceInf: 'C:\Windows\INF\wdmaudio.inf'
     flq:                          SourceSection: [sourcedisksfiles]
     flq:                          Source root path based on SourceInf
     flq:                          SourceRootPath: 'C:\Windows\System32\DriverStore\FileRepository\wdmaudio.inf_amd64_neutral_423894ded0ba8fdf'
     flq:                          {FILE_QUEUE_COPY}
     flq:                               CopyStyle      - 0x0b000000
     flq:                               {FILE_QUEUE_COPY}
     flq:                                    CopyStyle      - 0x0b000000
     flq:                                    SourceRootPath - 'C:\Windows\System32\DriverStore\FileRepository\wdmaudio.inf_amd64_neutral_423894ded0ba8fdf'
     flq:                                    SourceFilename - 'drmk.sys'
     flq:                                    TargetDirectory- 'C:\Windows\system32\drivers'
     flq:                                    TargetFilename - 'drmk.sys'
     flq:                                    SourceDesc     - 'windows cd'
     flq:                               {FILE_QUEUE_COPY exit(0x00000000)}
     flq:                          {FILE_QUEUE_COPY exit(0x00000000)}
     flq:                          QueueSingleCopy...
     flq:                          Inf     : 'c:\windows\system32\driverstore\filerepository\hdaudio.inf_amd64_neutral_cb351613c92a9f31\hdaudio.inf'
     flq:                          SourceInf: 'C:\Windows\INF\wdmaudio.inf'
     flq:                          SourceSection: [sourcedisksfiles]
     flq:                          Source root path based on SourceInf
     flq:                          SourceRootPath: 'C:\Windows\System32\DriverStore\FileRepository\wdmaudio.inf_amd64_neutral_423894ded0ba8fdf'
     flq:                          {FILE_QUEUE_COPY}
     flq:                               CopyStyle      - 0x0b000000
     flq:                               {FILE_QUEUE_COPY}
     flq:                                    CopyStyle      - 0x0b000000
     flq:                                    SourceRootPath - 'C:\Windows\System32\DriverStore\FileRepository\wdmaudio.inf_amd64_neutral_423894ded0ba8fdf'
     flq:                                    SourceFilename - 'portcls.sys'
     flq:                                    TargetDirectory- 'C:\Windows\system32\drivers'
     flq:                                    TargetFilename - 'portcls.sys'
     flq:                                    SourceDesc     - 'windows cd'
     flq:                               {FILE_QUEUE_COPY exit(0x00000000)}
     flq:                          {FILE_QUEUE_COPY exit(0x00000000)}
     inf:                     {Install Inf Section [WDMAUDIO.Registration] exit (0x00000000)}
     inf:                     {Install Inf Section [mssysfx.CopyFilesAndRegister]}
     inf:                          CopyFiles=FX.CopyList  (wdmaudio.inf line 103)
     flq:                          CopyFiles from an inbox inf.
     flq:                          QueueSingleCopy...
     flq:                          Inf     : 'c:\windows\system32\driverstore\filerepository\hdaudio.inf_amd64_neutral_cb351613c92a9f31\hdaudio.inf'
     flq:                          SourceInf: 'C:\Windows\INF\wdmaudio.inf'
     flq:                          SourceSection: [sourcedisksfiles]
     flq:                          Source root path based on SourceInf
     flq:                          SourceRootPath: 'C:\Windows\System32\DriverStore\FileRepository\wdmaudio.inf_amd64_neutral_423894ded0ba8fdf'
     flq:                          {FILE_QUEUE_COPY}
     flq:                               CopyStyle      - 0x0b000000
     flq:                               {FILE_QUEUE_COPY}
     flq:                                    CopyStyle      - 0x0b000000
     flq:                                    SourceRootPath - 'C:\Windows\System32\DriverStore\FileRepository\wdmaudio.inf_amd64_neutral_423894ded0ba8fdf'
     flq:                                    SourceFilename - 'WMALFXGFXDSP.dll'
     flq:                                    TargetDirectory- 'C:\Windows\system32'
     flq:                                    TargetFilename - 'WMALFXGFXDSP.dll'
     flq:                                    SourceDesc     - 'windows cd'
     flq:                               {FILE_QUEUE_COPY exit(0x00000000)}
     flq:                          {FILE_QUEUE_COPY exit(0x00000000)}
     flq:                          QueueSingleCopy...
     flq:                          Inf     : 'c:\windows\system32\driverstore\filerepository\hdaudio.inf_amd64_neutral_cb351613c92a9f31\hdaudio.inf'
     flq:                          SourceInf: 'C:\Windows\INF\wdmaudio.inf'
     flq:                          SourceSection: [sourcedisksfiles]
     flq:                          Source root path based on SourceInf
     flq:                          SourceRootPath: 'C:\Windows\System32\DriverStore\FileRepository\wdmaudio.inf_amd64_neutral_423894ded0ba8fdf'
     flq:                          {FILE_QUEUE_COPY}
     flq:                               CopyStyle      - 0x0b000000
     flq:                               {FILE_QUEUE_COPY}
     flq:                                    CopyStyle      - 0x0b000000
     flq:                                    SourceRootPath - 'C:\Windows\System32\DriverStore\FileRepository\wdmaudio.inf_amd64_neutral_423894ded0ba8fdf'
     flq:                                    SourceFilename - 'SysFxUI.dll'
     flq:                                    TargetDirectory- 'C:\Windows\system32'
     flq:                                    TargetFilename - 'SysFxUI.dll'
     flq:                                    SourceDesc     - 'windows cd'
     flq:                               {FILE_QUEUE_COPY exit(0x00000000)}
     flq:                          {FILE_QUEUE_COPY exit(0x00000000)}
     inf:                     {Install Inf Section [mssysfx.CopyFilesAndRegister] exit (0x00000000)}
     dvi:                     Processing co-installer registration section [HdAudModel.CoInstallers].
     inf:      