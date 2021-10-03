# The issue fixed

Wrong CONTROL_AE_MODE_ON fixed

> In line #431~434

```
// For auto-focus
captureBuilder.set(CaptureRequest.CONTROL_AF_MODE, CaptureRequest.CONTROL_AF_MODE_AUTO);
```

# The feature added

- [ ] dialog for zoom step manipulating added

# Something to be increased image's quality

- [ ] The largest image size set for high resolution

> in line #413~422

```
SortedSet<OrderedSize> imageSizes = new TreeSet<>();
for (Size size : map.getOutputSizes(ImageFormat.JPEG)) {
    OrderedSize s = new OrderedSize(size.getWidth(), size.getHeight());
    imageSizes.add(s);
}

// The largest image size for high quality
int width = imageSizes.last().getWidth();
int height = imageSizes.last().getHeight();
ImageReader reader = ImageReader.newInstance(width, height, ImageFormat.JPEG, 1);
```

- [ ] The JPEG quality set to 100 for best quality

> in line #430

```
// Best quality for JPEG format
captureBuilder.set(CaptureRequest.JPEG_QUALITY, (byte)100);
```

- [ ] The PNG compression set to 100 for high quality

> in line #471

```
output = new FileOutputStream(imageFile);
rotatedBitmap.compress(Bitmap.CompressFormat.PNG, 100, output);
output.flush();
```

# What does mean?

```
public static final int REQUEST_CAMERA_PERMISSION = 200;
```

*This is a user defined request code value for permission requesting in Android.*

You can find the Android documentation 'Request app permissions' in details from 'https://developer.android.com/training/permissions/requesting'.

She says that;

> Traditionally, you [manage a request code yourself](https://developer.android.com/training/permissions/requesting.html#manage-request-code-yourself) as part of the permission request and include this request code in your permission callback logic. Another option is to use the [`RequestPermission`](https://developer.android.com/reference/androidx/activity/result/contract/ActivityResultContracts.RequestPermission) contract, included in an AndroidX library, where you [allow the system to manage the permission request code](https://developer.android.com/training/permissions/requesting.html#allow-system-manage-request-code) for you. Because using the `RequestPermission` contract simplifies your logic, it's recommended that you use it when possible.