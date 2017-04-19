DESCRIPTION = "github.com/julienschmidt/httprouter"

GO_IMPORT = "github.com/julienschmidt/httprouter"

inherit go

SRC_URI = "git://github.com/julienschmidt/httprouter;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "6f3f3919c8781ce5c0509c83fffc887a7830c938" 
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=0b9c96482c97c65c7b9e4ea7b842cc0c"

FILES_${PN} += "${GOBIN_FINAL}/*"
