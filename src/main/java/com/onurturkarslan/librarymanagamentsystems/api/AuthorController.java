package com.onurturkarslan.librarymanagamentsystems.api;

import com.onurturkarslan.librarymanagamentsystems.business.absract.IAuthorService;
import com.onurturkarslan.librarymanagamentsystems.core.config.modelMapper.IModelMapperService;
import com.onurturkarslan.librarymanagamentsystems.core.result.Result;
import com.onurturkarslan.librarymanagamentsystems.core.result.ResultData;
import com.onurturkarslan.librarymanagamentsystems.core.utilies.ResultHelper;
import com.onurturkarslan.librarymanagamentsystems.dto.request.author.AuthorSaveRequest;
import com.onurturkarslan.librarymanagamentsystems.dto.request.author.AuthorUpdateRequest;
import com.onurturkarslan.librarymanagamentsystems.dto.response.author.AuthorResponse;
import com.onurturkarslan.librarymanagamentsystems.entities.Author;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/authors")
public class AuthorController {
    private final IAuthorService authorService;
    private final IModelMapperService modelMapper;

    public AuthorController(IAuthorService authorService, IModelMapperService modelMapper) {
        this.authorService = authorService;
        this.modelMapper = modelMapper;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ResultData<AuthorResponse> save(@Valid @RequestBody AuthorSaveRequest authorSaveRequest) {
        Author saveAuthor = this.modelMapper.forRequest().map(authorSaveRequest, Author.class);
        this.authorService.save(saveAuthor);
        AuthorResponse authorResponse = this.modelMapper.forResponse().map(saveAuthor, AuthorResponse.class);
        return ResultHelper.created(authorResponse);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResultData<AuthorResponse> get(@PathVariable("id") int id) {
        Author author = this.authorService.get(id);
        AuthorResponse authorResponse = this.modelMapper.forResponse().map(author, AuthorResponse.class);
        return ResultHelper.success(authorResponse);
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResultData<AuthorResponse> update(@Valid @RequestBody AuthorUpdateRequest authorUpdateRequest) {
        Author updateAuthor = this.modelMapper.forRequest().map(authorUpdateRequest, Author.class);
        this.authorService.update(updateAuthor);
        AuthorResponse authorResponse = this.modelMapper.forResponse().map(updateAuthor, AuthorResponse.class);
        return ResultHelper.success(authorResponse);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Result delete(@PathVariable("id") int id) {
        this.authorService.delete(id);
        return ResultHelper.ok();
    }
}
