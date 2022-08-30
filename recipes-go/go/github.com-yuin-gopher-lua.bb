DESCRIPTION = "github.com/yuin/gopher-lua"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=5ea59bf62229a35ae7b2c7208524163e"

SRC_URI = "git://github.com/yuin/gopher-lua;protocol=https;branch=master"
SRCREV = "66c871e454fcf10251c61bf8eff02d0978cae75a" 

GO_IMPORT = "github.com/yuin/gopher-lua"

export GO111MODULE="off"

inherit go

FILES:${PN} += "${GOBIN_FINAL}/*"
