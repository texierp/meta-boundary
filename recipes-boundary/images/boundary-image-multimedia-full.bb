# This image extends fsl-image-multimedia-full with additional
# Boundary Devices packages

require recipes-fsl/images/fsl-image-multimedia-full.bb

CORE_IMAGE_EXTRA_INSTALL += " \
	i2c-tools \
	iperf3 \
	imx-gpu-viv-demos \
	kernel-module-qcacld \
	linux-firmware-bdsdmac \
	mmc-utils \
	openssh \
	spitools \
	connman \
"
