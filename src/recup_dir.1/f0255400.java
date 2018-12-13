196}\{3C0D501A-140B-11D1-B40F-00A0C9223196}]
>>>  Section start 2015/09/25 01:21:06.520
     ump: Creating Install Process: DrvInst.exe 01:21:06.520
     ndv: Retrieving device info...
     ndv: Setting device parameters...
     ndv: Searching Driver Store and Device Path...
     dvi: {Build Driver List} 01:21:06.520
     dvi:      Searching for hardware ID(s):
     dvi:           sw\{96e080c7-143c-11d1-b40f-00a0c9223196}
     cpy:      Policy is set to make all digital signatures equal.
     dvi:      Enumerating INFs from path list 'C:\Windows\inf'
     inf:      Opened PNF: 'C:\Windows\System32\DriverStore\FileRepository\ksfilter.inf_amd64_neutral_86311fdf78a07678\ksfilter.inf' ([strings.0409])
     dvi:      Created Driver Node:
     dvi:           HardwareID   - SW\{96E080C7-143C-11D1-B40F-00A0C9223196}
     dvi:           InfName      - C:\Windows\System32\DriverStore\FileRepository\ksfilter.inf_amd64_neutral_86311fdf78a07678\ksfilter.inf
     dvi:           DevDesc      - Microsoft Streaming Service Proxy
     dvi:           DrvDesc      - Microsoft Streaming Service Proxy
     dvi:           Provider     - Microsoft
     dvi:           Mfg          - Microsoft
     dvi:           ModelsSec    - Microsoft.NTamd64
     dvi:           InstallSec   - MSKSSRV
     dvi:           ActualSec    - MSKSSRV.NT
     dvi:           Rank         - 0x00ff0000
     dvi:           Signer       - Microsoft Windows
     dvi:           Signer Score - INBOX
     dvi:           DrvDate      - 06/21/2006
     dvi:           Version      - 6.1.7600.16385
     inf:      Searched 1 potential matches in published INF directory
     inf:      Searched 35 INFs in directory: 'C:\Windows\inf'
     dvi: {Build Driver List - exit(0x00000000)} 01:21:06.785
     ndv: Selecting best match from Driver Store (including Device Path)...
     dvi: {DIF_SELECTBESTCOMPATDRV} 01:21:06.785
     dvi:      Using exported function 'MediaClassInstaller' in module 'C:\Windows\system32\mmci.dll'.
     dvi:      Class installer == mmci.dll,MediaClassInstaller
     dvi:      Using exported function 'MediaClassCoInstaller' in module 'C:\Windows\system32\mmcico.dll'.
     dvi:      CoInstaller 1 == mmcico.dll,MediaClassCoInstaller
     dvi:      CoInstaller 1: Enter 01:21:06.785
     dvi:      CoInstaller 1: Exit
     dvi:      Class installer: Enter 01:21:06.785
     inf:           Opened PNF: 'C:\Windows\INF\ksfilter.inf' ([strings.0409])
     dvi:      Class installer: Exit
     dvi:      Default installer: Enter 01:21:06.785
     dvi:           {Select Best Driver}
     dvi:                Selected driver installs from section [MSKSSRV] in 'c:\windows\system32\driverstore\filerepository\ksfilter.inf_amd64_neutral_86311fdf78a07678\ksfilter.inf'.
     dvi:                Class GUID of device changed to: {4d36e96c-e325-11ce-bfc1-08002be10318}.
     dvi:                {DIF_DESTROYPRIVATEDATA} 01:21:06.785
     dvi:                     CoInstaller 1: Enter 01:21:06.785
     dvi:                     CoInstaller 1: Exit
     dvi:                     Class installer: Enter 01:21:06.785
     dvi:                     Class installer: Exit
     dvi:                     Default installer: Enter 01:21:06.785
     dvi:                     Default installer: Exit
     dvi:                {DIF_DESTROYPRIVATEDATA - exit(0xe000020e)} 01:21:06.785
     dvi:                Set selected driver complete.
     dvi:                Selected:
     dvi:                     Description - [Microsoft Streaming Service Proxy]
     dvi:                     InfFile     - [c:\windows\system32\driverstore\filerepository\ksfilter.inf_amd64_neutral_86311fdf78a07678\ksfilter.inf]
     dvi:                     Section     - [MSKSSRV]
     dvi:                     Signer      - [Microsoft Windows]
     dvi:                     Rank        - [0x00ff0000]
     dvi:           {Select Best Driver - exit(0x00000000)}
     dvi:      Default installer: Exit
     dvi: {DIF_SELECTBESTCOMPATDRV - exit(0x00000000)} 01:21:06.785
     inf: {SetupCopyOE