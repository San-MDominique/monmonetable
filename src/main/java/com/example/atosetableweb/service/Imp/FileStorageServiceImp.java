package com.example.atosetableweb.service.Imp;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.example.atosetableweb.service.FileStorageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class FileStorageServiceImp implements FileStorageService {
    private  final Cloudinary cloudinary;

    @Override
    public String upload(MultipartFile file) throws IOException {

// Upload the image
        Map params1 = ObjectUtils.asMap(
                "use_filename", true,
                "unique_filename", false,
                "overwrite", true
        );

        Map upload = cloudinary.uploader().upload(file, params1);
        System.out.println(upload);
        return "";
    }
}
